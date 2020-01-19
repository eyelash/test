import Vue from 'vue';

export default Vue.extend({
  template: '<button v-on:click="handleClick">CLICK ME ({{count}})</button>',
  data() {
    return {
      count: 0
    }
  },
  methods: {
    handleClick() {
      this.count += 1;
    }
  }
});
