/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.MenuEnum;
import dto.MenuDto;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import utils.ColorUtils;
import view.PnClassManager;
import view.PnCourseManagers;
import view.PnHomePage;
import view.PnStudentManagers;
import view.PnThongKe;

/**
 *
 * @author PC
 */
public class Navigator {

    private MenuEnum pressedMenu;
    private JPanel selectedPanel;
    private final JPanel pnMainView;
    private List<MenuDto> menus;

    public Navigator(final JPanel pnMainView) {
        this.pnMainView = pnMainView;

    }

    public void setStartPage(JPanel startPage) {
        pressedMenu=MenuEnum.HOMEPAGE;
        pnMainView.removeAll();
        pnMainView.setLayout(new BorderLayout());
        pnMainView.add(new PnHomePage());
        pnMainView.validate();
        pnMainView.repaint();
    }

    public void setEvent(List<MenuDto> menus) {
        this.menus = menus;
        menus.forEach(menu -> {
            menu.getLbName().addMouseListener(new LableMenuEvent(menu));
        });

    }

    class LableMenuEvent extends MouseAdapter {

        private final MenuEnum curMenu;
        private final JPanel curPanel;
        private final JLabel curLable;

        public LableMenuEvent(MenuDto menu) {
            this.curMenu = menu.getMenuName();
            this.curPanel = menu.getPnName();
            this.curLable = menu.getLbName();
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            curPanel.setBackground(ColorUtils.hoverMenu);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (pressedMenu != curMenu) {
                curPanel.setBackground(ColorUtils.nomalMenu);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            pressedMenu = curMenu;
            menus.forEach((menuDto) -> {
                menuDto.getPnName().setBackground(ColorUtils.nomalMenu);
            });
            curPanel.setBackground(ColorUtils.hoverMenu);
            switch (curMenu) {
                case HOMEPAGE:
                    selectedPanel = new PnHomePage();
                    break;
                case STUDENT_MANAGER:
                    selectedPanel = new PnStudentManagers();
                    break;
                case COURSE_MANAGER:
                    selectedPanel = new PnCourseManagers();
                    break;
                case STATISTICAL_MANAGER:
                    selectedPanel = new PnThongKe();
                    break;
                case CLASS_MANAGER:
                    selectedPanel = new PnClassManager();
                    break;

            }
            pnMainView.removeAll();
            pnMainView.setLayout(new BorderLayout());
            pnMainView.add(selectedPanel);
            pnMainView.validate();
            pnMainView.repaint();
        }

    }
}
