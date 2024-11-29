package com.polytechnics.demo.refrigerator.service.ref;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.common.Expire;

@Service
public class ExpireService {

    private List<Expire> expireList = new ArrayList<>();

    // 예시로 데이터 추가
    public List<Expire> getAllExpire() {
        // 실제 데이터베이스에서 데이터를 가져오지 않고, 메모리 내 데이터 리스트 반환
        return expireList;
    }

    public void deleteExpire(int id) {
        // id에 해당하는 Expire 객체를 삭제하는 로직 추가 (여기서는 임시로 리스트에서 삭제하는 방식)
        expireList.removeIf(expire -> expire.getFoodInfo().getId() == id); // FoodInfo의 ID를 기준으로 삭제
    }

    // 예시로 데이터 추가 메서드
    public void addExpire(Expire expire) {
        expireList.add(expire);
    }
}
