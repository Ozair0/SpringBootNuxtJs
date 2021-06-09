<template>
  <div>
    <ul v-if="cars">
      <li v-for="(car, index) in cars" v-bind:key="index">
        Car Model: {{ car.model }} Car Driver: {{ car.driver.name }}
      </li>
    </ul>
    <br />
    <button @click.prevent="loadData()">Load Data</button>
    <button @click.prevent="AddData()">Add Data</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      cars: null
    };
  },

  // TODO For SEO use asyncData
  // async created() {
  //   this.cars = await this.$axios.$get("/api/api/cars");
  // },

  // async asyncData({ $axios }) {
  //   const cars = await $axios.$get("/api/cars");
  //   return { cars };
  // },

  methods: {
    async loadData() {
      this.cars = await this.$axios.$get("http://localhost:8080/api/cars");
    },
    async AddData() {
      this.cars = await this.$axios.$post("http://localhost:8080/api/cars");
    }
  }
};
</script>

<style>
/* .container {
  margin: 0 auto;
  min-height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
} */
</style>
