/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goplay;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class LlenarTabla {

    public LlenarTabla() {
    }

    public void Llenar(DefaultTableModel tableModel, Object[] fila) {
        //Object[] objs = {1, "Arsenal", 35, 11, 2, 2, 15, 30, 11, 19};

        tableModel.addRow(fila);
    }

}
