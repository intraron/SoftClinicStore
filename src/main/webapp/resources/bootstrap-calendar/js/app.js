var eventData = new Array;

(function($) {
	
	$.ajax({
		type : 'GET',
		url: 'listaeventos.do',
		dataType: 'json',
		async: false,
		error: function(data){
	        alert("error petición ajax"+data);
		},
		success: function(doc) {
			eventData.push({
				success: 1
			});
			$(doc).each(function() {
				eventData.push({
					id: $(this).attr('nId').toString(),
					title: $(this).attr('sTitulodeCita'),
					url: $(this).attr('sUrl'),
					class: $(this).attr('sTipodeCita'),
					start: $(this).attr('nIniciodeCita').toString(),
					end: $(this).attr('nFindeCita').toString(),
					description: $(this).attr('sMotivodeCita'),
					doctor: $(this).attr('sUsuariosis_Contacto_Doctor'),
					paciente: $(this).attr('sUsuariosis_Contacto_Paciente')
				});
			});
		}
		});

	"use strict";
	//creamos la fecha actual
		var date = new Date();
		var yyyy = date.getFullYear().toString();
		var mm = (date.getMonth()+1).toString().length == 1 ? "0"+(date.getMonth()+1).toString() : (date.getMonth()+1).toString();
		var dd  = (date.getDate()).toString().length == 1 ? "0"+(date.getDate()).toString() : (date.getDate()).toString();
		
	var options = {
		events_source: eventData,
		//events_source: 'resources/bootstrap-calendar/events.json.php',
		view: 'month',
		language: 'es-ES',
		tmpl_path: 'resources/bootstrap-calendar/tmpls/',
		tmpl_cache: false,
		day: yyyy+'-'+mm+'-'+dd,
		//day: '2013-03-12',
		time_start: '09:00',
		time_end: '19:00',
		time_split: '30',
		width: '100%',
		onAfterEventsLoad: function(events) {
			if(!events) {
				return;
			}
			var list = $('#eventlist');
			list.html('');

			$.each(events, function(key, val) {
				$(document.createElement('li'))
					.html('<a href="' + val.url + '">' + val.title + '</a>')
					.appendTo(list);
			});
		},
		onAfterViewLoad: function(view) {
			$('.page-header h3').text(this.getTitle());
			$('.btn-group button').removeClass('active');
			$('button[data-calendar-view="' + view + '"]').addClass('active');
		},
		classes: {
			months: {
				general: 'label'
			}
		}
	};

	var calendar = $('#calendar').calendar(options);

	$('.btn-group button[data-calendar-nav]').each(function() {
		var $this = $(this);
		$this.click(function() {
			calendar.navigate($this.data('calendar-nav'));
		});
	});

	$('.btn-group button[data-calendar-view]').each(function() {
		var $this = $(this);
		$this.click(function() {
			calendar.view($this.data('calendar-view'));
		});
	});

	calendar.setOptions({first_day: '1'});
	/*
	$('#first_day').change(function(){
		var value = $(this).val();
		value = value.length ? parseInt(value) : null;
		calendar.setOptions({first_day: value});
		calendar.view();
		alert(value);
	});
	$('#language').change(function(){
		calendar.setLanguage($(this).val());
		calendar.view();
	});
	*/
	
	calendar.setOptions(
			{
				modal: '#events-modal',
				modal_type:'template'
			}
			);
	calendar.setOptions({format12: false});
	/*
	$('#events-in-modal').change(function(){
		var val = $(this).is(':checked') ? $(this).val() : null;
		calendar.setOptions({modal: val});
	});
	
	$('#format-12-hours').change(function(){
		var val = $(this).is(':checked') ? true : false;
		calendar.setOptions({format12: val});
		calendar.view();
	});
	*/
	
	calendar.setOptions({display_week_numbers: true});
	calendar.setOptions({weekbox: true});
	/*
	$('#show_wbn').change(function(){
		var val = $(this).is(':checked') ? true : false;
		calendar.setOptions({display_week_numbers: val});
		calendar.view();
	});
	$('#show_wb').change(function(){
		var val = $(this).is(':checked') ? true : false;
		calendar.setOptions({weekbox: val});
		calendar.view();
	});
	*/
	$('#events-modal .modal-header, #events-modal .modal-footer').click(function(e){
		//e.preventDefault();
		//e.stopPropagation();
		//alert("hola");
	});
}(jQuery));