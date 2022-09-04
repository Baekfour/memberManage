package kr.ac.kopo.ctc.spring.member.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.ctc.spring.member.domain.Member;
import kr.ac.kopo.ctc.spring.member.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;

	public List<Member> findAll() {
		return memberRepository.findAll();
	}

	public Member findById(int id) {
		return memberRepository.findById(id).get();
	}

	public void write(String name, String address, String birth, String password, String phoneNumber, String user_id)
			throws Exception {
		Member first = new Member();
		first.setUser_id(user_id);
		first.setName(name);
		first.setAddress(address);
		first.setBirth(birth);
		first.setPassword(password);
		first.setPhonenumber(phoneNumber);
		memberRepository.save(first);
	}

	public void updateMember(int id, String name, String address, String birth, String password, String phoneNumber,
			String user_id) {
//		Board first = boardRepository.findById(id);
		Optional<Member> memberUpdate = memberRepository.findById(id);
		memberUpdate.ifPresent(selectMember -> {
			if (name == null || name == "") {

			} else {
				selectMember.setName(name);
			}
			if (address == null) {

			} else {
				selectMember.setAddress(address);
			}
			if (birth == null) {

			} else {
				selectMember.setBirth(birth);
			}

			if (password == null) {

			} else {
				selectMember.setPassword(password);
			}
			if (phoneNumber == null) {

			} else {
				selectMember.setPhonenumber(phoneNumber);
			}
			if (user_id == null) {

			} else {
				selectMember.setUser_id(user_id);
			}
			memberRepository.save(selectMember);
		});
	}

	public void deleteAll() {
		memberRepository.deleteAll();
	}

	public void deleteid(int id) {
		memberRepository.deleteById(id);
	}
}
