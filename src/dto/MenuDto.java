/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Objects;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class MenuDto {
    private String MenuName;
    private JPanel pnName;
    private JLabel lbName;

    public MenuDto() {
    }

    public MenuDto(String MenuName, JPanel pnName, JLabel lbName) {
        this.MenuName = MenuName;
        this.pnName = pnName;
        this.lbName = lbName;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String MenuName) {
        this.MenuName = MenuName;
    }

    public JPanel getPnName() {
        return pnName;
    }

    public void setPnName(JPanel pnName) {
        this.pnName = pnName;
    }

    public JLabel getLbName() {
        return lbName;
    }

    public void setLbName(JLabel lbName) {
        this.lbName = lbName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
           return true;
        }
        if(obj == null || !(obj instanceof MenuDto)){
            return false;
        }
        MenuDto menuDto = (MenuDto) obj;
        return this.equals(menuDto.getMenuName());
    }

    @Override
    public int hashCode() {
       return Objects.hash(this.MenuName);
    }
    
}
