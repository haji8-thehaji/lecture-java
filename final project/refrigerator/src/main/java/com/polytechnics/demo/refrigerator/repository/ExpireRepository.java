package com.polytechnics.demo.refrigerator.repository;

import java.util.List;

import com.polytechnics.demo.refrigerator.model.ref.common.Expire;

public interface ExpireRepository {
    List<Expire> getAllExpire(); // Expire 목록을 가져오는 메서드

    void deleteExpire(int id); // Expire 삭제 메서드
}
