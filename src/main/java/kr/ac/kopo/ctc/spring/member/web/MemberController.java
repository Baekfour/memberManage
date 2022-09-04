package kr.ac.kopo.ctc.spring.member.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import kr.ac.kopo.ctc.spring.member.domain.Member;
import kr.ac.kopo.ctc.spring.member.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	// 회원 한명 보기
	@ResponseBody
	@RequestMapping(value = "/oneMember", method = RequestMethod.GET)
	@ApiOperation(value = "회원 한명 보기", notes = "회원 한명 보기")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "id", value = "찾을 회원 고유번호", required = true)
	})
	public Member oneMemberView(int id) throws Exception {

		return memberService.findById(id);
	}
	// 회원 전체 보기
	@ResponseBody
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ApiOperation(value = "회원 전체보기", notes = "회원 전체보기")
	public List<Member> findAll() {
		return memberService.findAll();
	}

	// 회원가입
	@ResponseBody
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	@ApiOperation(value = "회원 가입", notes = "회원가입")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "name", value = "가입자 이름", required = true),
		@ApiImplicitParam(name = "address", value = "가입자 주소", required = true),
		@ApiImplicitParam(name = "birth", value = "가입자 생일", required = true),
		@ApiImplicitParam(name = "phoneNumber", value = "가입자 핸드폰번호", required = true),
		@ApiImplicitParam(name = "password", value = "가입자 비밀번호", required = true),
		@ApiImplicitParam(name = "user_id", value = "가입자 아이디", required = true)
	})
	public List<Member> signUp(String name,String address, String birth, String password,
			 String phoneNumber, String user_id) throws Exception {

		memberService.write(name, address, birth, password, phoneNumber, user_id);

		return memberService.findAll();
	}

	// 회원수정
	@ResponseBody
	@RequestMapping(value = "/updateMember", method = RequestMethod.PATCH)
	@ApiOperation(value = "회원 수정", notes = "회원수정")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "id", value = "수정할 대상 고유번호", required = true),
		@ApiImplicitParam(name = "name", value = "수정할 이름", required = false),
		@ApiImplicitParam(name = "address", value = "수정할 주소", required = false),
		@ApiImplicitParam(name = "birth", value = "수정할 생일", required = false),
		@ApiImplicitParam(name = "password", value = "수정할 비밀번호", required = false),
		@ApiImplicitParam(name = "phoneNumber", value = "수정할 핸드폰번호", required = false),
		@ApiImplicitParam(name = "user_id", value = "수정할 아이디", required = false)
	})
	public List<Member> memberUpdate(int id,String name,String address, String birth, String password,
			 String phoneNumber, String user_id) throws Exception {

		memberService.updateMember(id, name, address, birth, password, phoneNumber, user_id);

		return memberService.findAll();
	}

	// 회원 한명 삭제
	@ResponseBody
	@RequestMapping(value = "/deleteOneMember", method = RequestMethod.DELETE)
	@ApiOperation(value = "회원 한명 삭제", notes = "회원 한명 삭제")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "id", value = "삭제할 회원 고유번호", required = true)
	})
	public List<Member> deleteOne(int id) throws Exception {
		memberService.deleteid(id);
		return memberService.findAll();
	}

	// 회원 전체 삭제
	@ResponseBody
	@RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
	@ApiOperation(value = "회원 전체 삭제", notes = "회원 전체 삭제")
	public String deleteAll() throws Exception {
		memberService.deleteAll();
		return "전체삭제되었습니다";
	}
}
