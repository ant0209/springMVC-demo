/** common.js By Beginner Emain:zheng_jinfan@126.com HomePage:http://www.zhengjinfan.cn */
layui.define(['layer'], function(exports) {
	"use strict";

	var $ = layui.jquery,
		layer = layui.layer;

	var common = {
		post : function(url, params, successCall){
			$.ajax({
				type : 'post',
				url : '../../' + url,
				contentType : 'application/json;charset=utf-8',
				data : JSON.stringify(params),
				dataType : 'json',
				success : function(ret) {
					successCall(ret);
				},
				error : function(msg) {
					console.log('请求失败：' + JSON.stringify(msg));
				}
			});
		},

		/**
		 * 抛出一个异常错误信息
		 * @param {String} msg
		 */
		throwError: function(msg) {
			throw new Error(msg);
			return;
		},
		/**
		 * 弹出一个错误提示
		 * @param {String} msg
		 */
		msgError: function(msg) {
			layer.msg(msg, {
				icon: 5
			});
			return;
		}
	};

	exports('common', common);
});