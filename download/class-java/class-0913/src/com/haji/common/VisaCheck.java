package com.haji.common;

public interface VisaCheck{
    /**
     * 사회적 보장 번호를 체크하여 결과 반환
     * 결과는 성공 : 1, 실패 : 0 으로 표시됨
     * @return success
     */
    public Integer VisaCheck();
}