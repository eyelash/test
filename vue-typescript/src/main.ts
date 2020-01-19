import Vue from 'vue';
import CustomComponent from './CustomComponent';

Vue.component('custom-component', CustomComponent);
new Vue({
	el: '#root',
	template: '<custom-component></custom-component>'
})
