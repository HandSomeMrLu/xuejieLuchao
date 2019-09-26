<template>
  <div id="app">
    <indexHead></indexHead>
    <left></left>
    <right></right>
  </div>
</template>

<script>

    import indexHead from "./Header"
    import left from "./Left"
    import right from "./Right"
    export default {
        name: "",
        components: {
          indexHead,
          left,
          right
        }
    }
</script>

<style scoped>

</style>
