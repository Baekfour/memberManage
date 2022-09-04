<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <title>회원가입 페이지</title>

    <link href="signup.css" rel="stylesheet" />
    <script src="signup.js"></script>

</head>
<style>
	* {
    margin: 0px;
    box-sizing: border-box;
    font-size: 11px;
}

html {
    width: 100%;
    display: flex;
    justify-content: center;
    padding-top: 20px;
    padding-bottom: 20px;
}

body {
    width: 45%;
    border: 1px solid black;
}

input{
    border: 1px solid black;
    border-radius: 3px;
    line-height: 35px;
    font-size: 12px;
    padding-left: 10px;
    padding-right: 10px;
}


.wrapper {
    padding: 10px;
}

div {
    padding-top: 3px;
    padding-bottom: 8px;
}

.title {
    text-align: center;
    font-weight: 700;
}

.email input {
    width: 100%;
}

.name input {
    width: 100%;
}

.password input {
    width: 100%;
}

.passwordCheck input {
    width: 100%;
}

.phone {
    display: flex;
    justify-content: space-between;
    line-height: 35px;
}

#phone1 {
    width: 18%;
}

#phone2 {
    width: 30%;
}

#phone3 {
    width: 30%;
}

.auth {
    display: flex;
    justify-content: space-between;
}

.timer {
    display: flex;
    justify-content: space-between;
}

.auth div {
    width: 30%;
    text-align: center;
    font-weight: 700;
    font-size: 15px;
}

.auth button {
    width: 70%;
}

.timer div {
    width: 30%;
    text-align: center;
    font-weight: 700;
    font-size: 15px;
}

.timer button {
    width: 70%;
}

.area select {
    width: 100%;
    height: 40px;
}

.gender {
    text-align: center;
}

.signUp button {
    width: 100%;
    cursor:pointer;
}

button{
    cursor: pointer;
    height: 30px;
}

.error{
    font-size: 1px;
    height: 20px;
    color:red;
    font-weight: 700;
}
</style>
<body>
<form action="index.html" method="post">
    <div class="wrapper">
        <div class="title"><h1 style="font-size: 21px;">회원가입</h1></div>
        <div class="name">
            <input name="user_id" id="name"  type="text" placeholder="아이디를 입력해 주세요.">
        </div>
        <div class="password">
            <input name="password" id="password" type="password" placeholder="비밀번호를 입력해 주세요.">
        </div>
        <div class="passwordCheck">
            <input name="id="passwordCheck" type="password" placeholder="비밀번호를 다시 입력해 주세요.">
        </div>
        <div class="name">
            <input name="name" id="name"  type="text" placeholder="이름을 입력해 주세요.">
        </div>
        <div class="email">
            <input name="birth" id="email" type="text" placeholder="주민등록번호 앞자리를 입력해주세요">
        </div>
        <div class="email">
            <input id="address" type="text" placeholder="주소를 입력해 주세요.">
        </div>
        <div class="phone">
            <input id="phone1" type="text" size="1" maxlength="3" oninput="changePhone1()"> -
            <input id="phone2" type="text" size="3" maxlength="4" oninput="changePhone2()"> -
            <input id="phone3" type="text" size="3" maxlength="4" oninput="changePhone3()">
		</div>
       
        <div class="gender">
            <input id="gender_man" type="radio" name="gender">남성  
            <input id="gender_woman" type="radio" name="gender">여성
        </div>
        <div class="line">
            <hr>
        </div>
        <div class="signUp">
            <button id="signUpButton" onclick="signUpCheck()">가입하기</button>
        </div>
    </div>
</form>
</body>

</html>

