"use strict"; /*선언함으로써 에러시 넘어가지않음*/
var app = app || {}; 
app = {
		init : x=>{
			console.log('step1')
			app.session.ctx(x)
			app.onCreate();
		},
		onCreate : ()=>{
			console.log('step3')
			app.setContentView()
			$('#login_btn').click(()=>{
				location.href = app.x()+'/move/public/member/login'
			})
			$('#join_btn').click(()=>{
				location.href = app.x()+'/move/public/member/add'
			})
			$('#joinFormBtn').click(()=>{
				location.href = app.x()+'/member/login'
			})
			$('#loginFormBtn').click(()=>{
				location.href = app.x()+'/member/login'
			})
			$('#logout_btn').click(()=>{
				location.href = app.x()+'/member/logout'
			})
		},
		setContentView : ()=>{
			console.log('step4 ::'+app.j());
		}
}
app.session = {
		ctx : x =>{
			console.log('step2 :: '+x)
			sessionStorage.setItem('ctx',x);
			sessionStorage.setItem('js',x+'/resources/js');
			sessionStorage.setItem('css',x+'/resources/css');
			sessionStorage.setItem('img',x+'/resources/img');
		},
		path : x=>{
			return sessionStorage.getItem(x);
		}
}
app.x = ()=>{
	return app.session.path('ctx')
}
app.j = ()=>{
	return app.session.path('js')
}
app.c = ()=>{
	return app.session.path('css')
}
app.i = ()=>{
	return app.session.path('img')
}

/*if(typeof test == 'undefined'){
	alert('test가 undefined이다.');
}*/
/*객체 리터럴방식으로 코딩함 
 * var는 static 개념 let은 에어리어메소드 개념
 */