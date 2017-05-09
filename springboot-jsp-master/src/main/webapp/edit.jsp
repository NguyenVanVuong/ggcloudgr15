<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags"%>

<mt:icsse title="Edit">
	<jsp:attribute name="content">
<div id="pnCenterDisplay" style="width: 692px; float: left">
			<script src="ckeditor/ckeditor.js" type="text/javascript"></script>
			
			<textarea rows="" cols="" id="myeditor" name="myeditor"></textarea>
			<button style="height: 50px;width: 100px;" type="button" id="save" name="submit" onclick="myFunction()">Submit</button>
	 			<script type="text/javascript">
		            CKEDITOR.replace('myeditor', {
		            })
		            
	         
	           var text = '${name}';
	           
	           var editor = CKEDITOR.instances['myeditor'];
	           
	            
	             editor.setData( text );
		            $(function () {
		                $('#myeditor').ckeditor({
		                    toolbar: 'Full',
		                    enterMode: CKEDITOR.ENTER_P
		                });
		            });
		         
		         	
		         		function myFunction() {
		         			var url = window.location;
		         			
	       		
	       	 var noidung = editor.document.getBody().getText();
	       	
	          $.ajax({
	        	    type : "GET",
	        	    url : url+"/upload",
	        	    data : "noidung="+noidung,
	        	    success : function(response){
	        	    	alert(response);
	        	    }
	        	});
		        }
	         
		         	
		            
		            </script>
	       	
		</div>
		
	</jsp:attribute>
</mt:icsse>





