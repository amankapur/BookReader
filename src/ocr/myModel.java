/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ocr;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akapur
 */
 public class myModel extends DefaultTableModel{
      public boolean isCellEditable(int row,int cols){
                                   return false;
      }
 }