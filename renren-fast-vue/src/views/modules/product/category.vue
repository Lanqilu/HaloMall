<template>
  <div>
    <el-tree :data="menus"
             :props="defaultProps"
             show-checkbox="true"
             :expand-on-click-node="false"
             node-key="catId"
             :default-expanded-keys="expandedKey">
    <span class="custom-tree-node" slot-scope="{node,data}">
      <span>{{ node.label }}</span>
      <span>
        <el-button v-if="node.level<=2" size="mini" type="text" @click=" ()=> append(data) ">Append</el-button>
        <el-button v-if="node.childNodes.length==0" size="mini" type="text"
                   @click=" ()=> remove(node, data) ">Delete</el-button>
      </span>
    </span>
    </el-tree>

    <el-dialog
      :title="title"
      :visible.sync="dialogVisible"
      width="30%"
      :close-on-click-modal="false">
      <el-form :model="category">
        <el-form-item label="分类名称">
          <el-input v-model="category.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="图标">
          <el-input v-model="category.icon" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="计量单位">
          <el-input v-model="category.productUnit" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="submitData">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data() {
    return {
      pCid: [],
      draggable: false,
      updateNodes: [],
      maxLevel: 0,
      title: "",
      dialogType: "", //edit,add
      category: {
        name: "",
        parentCid: 0,
        catLevel: 0,
        showStatus: 1,
        sort: 0,
        productUnit: "",
        icon: "",
        catId: null
      },
      dialogVisible: false,
      menus: [],
      expandedKey: [],
      defaultProps: {
        children: "children",
        label: "name"
      }
    }
  },
  methods: {
    getMenus() {
      this.$http({
        url: this.$http.adornUrl("/product/category/list/tree"),
        method: "get"
      }).then(({data}) => {
        console.log("成功获取到菜单数据", data.data);
        this.menus = data.data
      })
    },
    append(data) {
      console.log("append", data)
      this.dialogVisible = true;
      this.category.parentCid = data.catId;
      this.category.catLevel = data.catLevel + 1;
    },
    submitData() {

    },
    remove(node, data) {
      let ids = [data.catId];
      // 弹窗确认选择框
      this.$confirm(`是否删除【${data.name}】菜单?`, "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning"
      }).then(() => {
        // 弹窗确认选择确定
        this.$http({
          url: this.$http.adornUrl('/product/category/delete'),
          method: 'post',
          data: this.$http.adornData(ids, false)
        }).then(({data}) => {
          // 删除成功消息提示$message
          this.$message({
            message: "菜单删除成功",
            type: "success"
          });
          //刷新出新的菜单
          this.getMenus()
          //设置需要默认展开的菜单
          this.expandedKey = [node.parent.data.catId];
        })
      }).catch(
        // 弹窗确认选择取消
        () => {
        }
      );
      console.log("remove", node, data)
    }
  },
  created() {
    this.getMenus();
  }
}
</script>

<style scoped>

</style>
