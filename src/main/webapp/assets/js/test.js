

$(document).ready(function(){
	

	var Song = Backbone.Model.extend();

	var contextPath = $('body').data('baseurl')
	window.App = {

		    get : function(url) {
		        var data = "<h1> failed to load url : " + url + "</h1>";
		        $.ajax({
		            async: false,
		            url: url,
		            dataType: "text",

		            success: function(response) {
		                data = response;
		            }
		        });
		        return data;
		    }
		}

	var SongView = Backbone.View.extend({
		render: function (){
			
			var template = _.template(App.get(contextPath+'templates/abc.html'));
			var html = template(this.model.toJSON());
			this.$el.html(html);
			return this;
		}
	})

	var song = new Song({title:'sssssss'})


	var songview = new SongView({el:'#hello',model:song})

	songview.render()
	
	
	
});
