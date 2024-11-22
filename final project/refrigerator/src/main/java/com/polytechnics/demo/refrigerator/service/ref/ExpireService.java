package com.polytechnics.demo.refrigerator.service.ref;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.common.Expire;

@Service
public class ExpireService {

    private List<Expire> expireList = new ArrayList<>();

    // Expire 데이터 목록 가져오기
    public List<Expire> getAllExpire() {
        return expireList; // 실제 데이터베이스 사용 대신 메모리 내 데이터 목록 반환
    }

    // Expire 데이터 삭제
    public void deleteExpire(int id) {
        expireList.removeIf(expire -> expire.getFoodInfo().getId() == id); // ID로 Expire 삭제
    }

    // 예시로 Expire 추가
    public void addExpire(Expire expire) {
        expireList.add(expire);
    }
}
