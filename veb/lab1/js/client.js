const form=document.querySelector('#inputForms');
const validatedButton = document.querySelector('#submitButton');
const xCoordinate=document.querySelector('#coordinateX');
const yCoordinate=document.querySelector('#coordinateY');
const rCoordinate=document.querySelector('#radiusR');

let coordinate;

function checkData(data, min, max){
  coordinate=data.value;
  
  if(coordinate){
    coordinate=coordinate.replace(',','.');
    if(coordinate<min || coordinate>max || !isNumber(coordinate)){
      let error=generateTip('Invalid data','red');
      data.parentElement.insertBefore(error,data);
      return false;
    }else{
      let correct=generateTip('Correct data', 'green');
      data.parentElement.insertBefore(correct, data);
      return true;

    }
  }else{
    let error=generateTip('Field is blank', 'red');
    data=parentElement.insertBefore(error, data);
    return false;
  }


}

function checkAllData(){
  const param1=checkData(xCoordinate, -2, 2);
  const param2=checkData(yCoordinate, -5,3);
  const param3=checkData(rCoordinate, 2, 5);
  return param1 && param2 && param3;
}

function isNumber(data){
  let n = parseFloat(data.replace(',','.'));
  return !isNaN(n) && isFinite(n);

}

function generateTip(text, color) { 
  let tip = document.createElement('div');
  tip.className = 'tip';
  tip.style.color = color;
  tip.innerHTML = text;
  return tip;
}

function removeValidation() {
  var tips = form.querySelectorAll('.tip')      
  for (var i = 0; i < tips.length; i++) {
      tips[i].remove()
  }
}


$(document).ready(function(){
  $.ajax({
    url:'php/load.php',
    method:'POST',
    dataType:'html',
    success:function(data){
      console.log('JS start');
      console.log(data);

      $('#resultTable>tbody').html(data);
    },
    error:function(error){
      console.log(error)
    }
  })
  $('#inputForms').on('submit', function(event){
    event.preventDefault();
    console.log("Got data for check!" );
    console.log('y: ', yCoordinate.value);
    console.log('R: ', rCoordinate.value);
    removeValidation();

    if(!checkAllData()){
      console.log('post canceled')
      return
    }
    console.log("data sending...")
    console.log($(this).serialize());

 

    $.ajax({
      url:'php/server.php',
      method:'POST',
      data:$(this).serialize() + "&timezone=" + new Date().getTimezoneOffset(),
      dataType: "html",
      success: function(data){
        console.log(data);
        $(".validate_button").attr("disabled", false);	
        $("#resultTable>tbody").html(data);
      },
      error:function(error){
        console.log(error);
        $(".validate_button").attr("disabled", false);	
      }

    })
  });

  $(".reset_button").on("click",function(){
    $.ajax({
      url: 'php/clear.php',
      method: "POST",
      dataType: "html",
      success: function(data){
        console.log(data);
        $("#resultTable>tbody").html(data);
      },
      error: function(error){
        console.log(error);	
      },
    })

  })
})