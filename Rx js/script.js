var button = document.querySelector('button');

var observer = {
	next: function(value) {
  	console.log(value);
  },
  error: function(error) {
  	console.log(error);
  },
  complete: function() {
  	console.log('Completed');
  }
};

//Rx.Observable.fromEvent(button, 'click')
var subscription = Rx.Observable.create(function(obs) {
	//obs.next('A value');
  //obs.error('Error');
  //setTimeout(function() {
  //	obs.complete();
  //  obs.next('A second value');
  //}, 2000);
  button.onclick = function(event) {
  	obs.next(event);
  }
})
	.subscribe(observer);
  
setTimeout(function() {
	subscription.unsubscribe();
}, 5000);


var input1 = document.querySelector('#input1');
var input2 = document.querySelector('#input2');

var span = document.querySelector('span');

var obs1 = Rx.Observable.fromEvent(input1, 'input');
var obs2 = Rx.Observable.fromEvent(input2, 'input');

obs1.mergeMap(
	event1 => {
  	return obs2.map(
    	event2 => event1.target.value + ' ' + event2.target.value
    )
  }
).subscribe(
	combinedValue => span.textContent = combinedValue
);
  