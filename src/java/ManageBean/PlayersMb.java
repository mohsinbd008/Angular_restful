/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBean;

import dao.Statistics_dao;
import entity.Satistics;
import java.util.List;

/**
 *
 * @author R-34
 */
public class PlayersMb {
//           static List<Players>playerList;
//         public PlayersMb() {
//           playerList = (List<Players>) new Statistics_dao().getAllPlayers();
//            System.out.println("Size: "+playerList.size());

    static List<Satistics> playerList;

    public PlayersMb() {

        playerList = (List<Satistics>) new Statistics_dao().getAllSatistics();
        System.out.println("Size: " + playerList.size());

    }

    public List<Satistics> getAllSatistics() {
        List<Satistics> l = new Statistics_dao().getAllSatistics();
        System.out.println("All Satistics Size " + l.size());
        return new Statistics_dao().getAllSatistics();
    }

    public Satistics getSatistics(int id) {
        return new Statistics_dao().getSatisticsById(id);
    }

    public Satistics addSatistics(Satistics satistics) {
        new Statistics_dao().saveSatistics(satistics);
        return satistics;
    }

    public Satistics updateSatistics(Satistics satistics) {
        new Statistics_dao().updateSatistics(satistics);
        return satistics;

    }

    public void deleteSatistics(int id) {
        Statistics_dao dao = new Statistics_dao();
        dao.deleteSatistics(dao.getSatisticsById(id));
    }
      public static List<Satistics> getSatisticsIdMap() {
        return new Statistics_dao().getAllSatistics();
    }
}
