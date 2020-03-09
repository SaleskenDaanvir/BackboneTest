var contextPath = $('body').data('baseurl');


var Task = Backbone.Model.extend({
    defaults: {
    	id: "",
    	actor: "",
    	company_name: "",
    	task_type: ""
    },
    
});

var TaskCollection = Backbone.Collection.extend({
    model: Task,
});

var Tasks = new TaskCollection;
$.get(contextPath+'rest/task').done(function(data){
	dataObj = JSON.parse(data)
	for(var i =0;i<dataObj.length;i++){
		Tasks.add(dataObj[i]);
	}
	
	console.log("data fetched")
})


//Create Task View
var TaskView = Backbone.View.extend({
	initialize : function() {
		this.render();
	},	
	
	events:{
		'click .card-img-top':'removeCard'
	},
	

  render: function() {
	  var parent =this;
	  $.get(contextPath+'pages/template.txt').done(function(data){
		  parent.$el.html(data);

	  })
	  
    return this;
  },
	removeCard: function(){
		console.log("removeCard")
		console.log(this);

	}
});

var ViewTask1 = Backbone.View.extend({
	el : "#abc",
	initialize : function() {
		this.render();
	},
	render : function() {
		 this.$el.html('');

		 Tasks.each(function(model) {
			var task = new TaskView({
				model : model
			});
			this.$el.append(task.render().el);
		}.bind(this));
		 console.log("templates rendered")
		return this;
	},
});



var ViewTask2 = Backbone.View.extend({
	el: "#def",

	initialize: function (){
		this.render();
	}, render: function(){
	    this.$el.html("This is the task DEF");
	 }
});