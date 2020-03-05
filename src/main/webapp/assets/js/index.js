
var contextPath = $('body').data('baseurl');


$(document).ready(function(){
	
	
	
	alert('ready')
	
	
	
	

});

var View1 = Backbone.View.extend({
	el: "#salesken_container",
	initialize: function (){
			this.render();
	}, render: function(){
		var parent = this;
		$.get(contextPath+'pages/task.jsp').done(function (data){
			parent.$el.html(data)

		})
		
		
		
	}
});



var View2 = Backbone.View.extend({
	el: "#salesken_container",
	initialize: function (){
		this.render();
		
	}, render: function(){
		var parent = this;
		$.get(contextPath+'pages/dashboard.jsp').done(function (data){
			parent.$el.html(data)

		})	}
});


var View3 = Backbone.View.extend({
	el: "#salesken_container",
	initialize: function (){
		this.render();
		
	}, render: function(){
		var parent = this;

		$.get(contextPath+'pages/lead.jsp').done(function (data){
			parent.$el.html(data)

		})	}
})







var projectRouter = Backbone.Router.extend({
	routes: {
'': 'dashboard',
'dashboard': 'dashboard',
'lead': 'lead',
'task': 'task'



},

task:function(){
  var view1 = new View1();
},
dashboard:function(){
	  var view1 = new View2();
	},
	lead: function(){
		  var view1 = new View3();

	}
});

var ProjRouter = new projectRouter();

  Backbone.history.start();
