"use strict"; /*선언함으로써 에러시 넘어가지않음*/
var app = app || {}; 
app = {
		init : x=>{
			alert('step1')
			app.session.ctx(x)
			app.onCreate();
		},
		onCreate : ()=>{
			alert('step3')
			app.setContentView()
		},
		setContentView : ()=>{
			alert('step4 ::'+app.session.path('js'));
		}
}
app.session = {
		ctx : x =>{
			alert('step2 ::'+x)
			sessionStorage.setItem('ctx',x);
			sessionStorage.setItem('js',x+'/resources/js');
			sessionStorage.setItem('css',x+'/resources/css');
			sessionStorage.setItem('img',x+'/resources/img');
		},
		path : x=>{
			return sessionStorage.getItem(x);
		}
}
/*객체 리터럴방식으로 코딩함 
 * var는 static 개념 let은 에어리어메소드 개념
 */