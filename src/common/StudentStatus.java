/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author PC
 */
public enum StudentStatus {
    WAITING("Đợi khóa sau"),
    INPROGRESS("Đang theo học"),
    DONE("Đã hoàn thành"),
    DISCARD("Tạm dừng");
    private String value;
    private StudentStatus(final String value){
        this.value= value;
    }
    private String getValue(){
        return value;
    }
}
