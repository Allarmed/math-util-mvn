/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.tuanhoang.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.tuanhoang.mathutil.core.MathUtility;

/**
 *
 * @author admin
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //assertEquals(69,69);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        
    }
}

//HỌC KĨ THUẬT KIỂM THỬ CHO DÂN DEV - KĨ THUẬT ĐT
//DATA DRIVEN TESTGIN - 

//TDD: TEST DRIVEN DEVELOPMENT:
//Kĩ thuật lập trình mà dân dev viết code đến đâu thì viết bộ test
//case đến đó (JUnit, NUnit, Mocha) và dùng 2 màu xanh đỏ để đảm
//bảo chất lượng code/chất lượng hàm!!! ĐÃ HỌC XONG

//HỌC KĨ THUẬT KIỂM THỬ CHO DÂN DEV - KĨ THUẬT DDT
//DDT: DATA DRIVEN TESTING - BỔ TRỢ CHO VIỆC XÀI UNIT TEST
//PHẦN MỞ RỘNG THÊM CỦA DDT

//LÀ KĨ THUẬT VIẾT CODE KIỂM THỬ MÀ TÁCH BỘ DATA KIỂM THỬ
//RA KHỎI CÂU LỆNH ASSERTEQUALS() CHO DỄ KIỂM SOÁT TEST CASE

//DDT là phần mở rộng thêm cho TDD tức là giúp cho code test (Unit test)
//trở nên dễ dàng đọc, bảo trì, dễ dàng phát hiện thiết test case

//DDT TÁCH DATA KIỂM THỬ RA 1 CHỖ RIÊNG, THƯỜNG LÀ MẢNG 2 CHIỀU
//(CÓ NHIỀU CỐT, CÁC CỘT CHÍNH LÀ DATA ĐƯA VÀO VÀ EXPECTED
//VÀ TA CẦN CÓ NHIỀU DÒNG NHƯ THẾ, ỨNG VỚI CÁC TEST CASE)

//VÀ MẢNG 2 CHIỀU NÀY FILL/ĐỔ TỪ TỪ VÀO TRONG HÀM ASSERTEQUALS()
//KĨ THUẬT TÁCH DATA TEST RIÊNG RA 1 CHỖ GỌI LÀ DDT
//DATA DRIVEN TESTING - VIẾT CODE TEST HƯỚNG VỀ VIEEKC TÁCH DATA

//DATA ĐƯỢC ĐƯA VÀO TRỞ LẠI QUÁ CÁC THAM SỐ/ BIẾN ĐẠI DIỆN
//NÊN DDT CÒN GỌI LÀ PARAMETERIZED TÉTING
//THAM SỐ HÓA CÁC DATA TEST,
