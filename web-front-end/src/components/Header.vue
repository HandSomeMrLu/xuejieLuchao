<template>
  <div id="head">
      <div class="head_left">
        <img src="../../static/img/logo.png" class="icon">
        <p class="head_title">里程碑迭代管理</p>
      </div>
      <div class="head_right">

        <button class="exit">退出系统</button>
        <p class="head_user"><i class="iconfont icon-ren"></i><span>你好，欢迎XXX</span></p>
      </div>
  </div>
</template>

<script>
    export default {
        name: "Header.vue"
    }
</script>

<style scoped>
  @import "../../static/css/header.css";

</style>
