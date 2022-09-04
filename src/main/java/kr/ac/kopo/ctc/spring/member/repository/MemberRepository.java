package kr.ac.kopo.ctc.spring.member.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.ctc.spring.member.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
	Optional<Member> findById(Integer id);
	
//	List<Member> getList();
//	void deleteAll();
	
	
	
}
