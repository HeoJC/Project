// 맨윗줄 메뉴바
window.onload = function () {

	let a;
	let userInfoLinks = document.getElementsByClassName('userInfoLinks');
	let userInfo = document.getElementById('userInfo');
	if (false) { // if(로그인){}

		// << 홍길동님
		a = document.createElement('a');
		a.setAttribute('class', 'userInfoLinks');
		a.setAttribute('href', '' /*개인정보페이지*/ );
		let userName = '홍길동' //DB쿼리
		a.innerHTML = userName + ' 님'
		userInfo.appendChild(a);
		// >>

		// << 장바구니
		a = document.createElement('a');
		a.setAttribute('class', 'userInfoLinks');
		a.setAttribute('href', '' /*개인정보페이지*/ );
		a.innerHTML = '장바구니'
		userInfo.appendChild(a);
		// >>

		// << 로그아웃
		a = document.createElement('a');
		a.setAttribute('class', 'userInfoLinks');
		a.setAttribute('href', '' /*개인정보페이지*/ );
		a.innerHTML = '로그아웃'
		a.onclick = function () {
			alert('로그아웃 되었습니다.')
		}
		userInfo.appendChild(a);
		// >>
	} else {

		// << 로그인
		a = document.createElement('a');
		a.setAttribute('class', 'userInfoLinks');
		a.setAttribute('href', 'login.html');
		a.innerHTML = '로그인'
		userInfo.appendChild(a);
		// >>

		// << 회원가입
		a = document.createElement('a');
		a.setAttribute('class', 'userInfoLinks');
		a.setAttribute('href', 'register.html' );
		a.innerHTML = '회원가입'
		userInfo.appendChild(a);
		// >>
	}

	// << 마우스오버 밑줄 함수
	for (let i = 0; i < userInfoLinks.length; i++) {
		userInfoLinks[i].onmouseover = function () {
			this.setAttribute('style', 'text-decoration: underline;')
		}
		userInfoLinks[i].onmouseout = function () {
			this.setAttribute('style', 'text-decoration: none;')
		}
	}
	// >>
}