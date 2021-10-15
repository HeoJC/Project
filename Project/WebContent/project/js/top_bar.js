	window.onload = function () {

		// << createElement
		let a;
		// >>

		// << getElement
		let userInfoLinks = document.getElementsByClassName('userInfoLinks');
		let leftiFrameDiv = document.getElementById('leftiFrameDiv');
		let rightiFrameDiv = document.getElementById('rightiFrameDiv');
		let leftiFrame = document.getElementById('leftiFrame');
		let rightiFrame = document.getElementById('rightiFrame');
		let userInfo = document.getElementById('userInfo');
		// >>

		// 맨윗줄메뉴
		if (true) { // if(로그인){}

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