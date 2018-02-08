/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightupload;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp1
 */
public class flightinterImpl implements flightinterface {

    @Override
    public void insert(flightgettersetter cgs) {

        try {

            Connection conn = load.Load.getInstance().getConnection();

            String query = "insert into flight(flightname,flightnumber,flightstate,flightfrom,flightto,"
                    + "flightdistance,flightetp,flightbtp,flightdate,flightseatrows,flightseatcols,flightdepature,flightarrival,flightduration,flightrunway,flightimage) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, cgs.getFlightName());
            ps.setString(2, cgs.getFlightNumber());
            ps.setString(3, cgs.getFlightState());
            ps.setString(4, cgs.getFlightFrom());
            ps.setString(5, cgs.getFlightTo());
            ps.setString(6, cgs.getFlightDistance());
            ps.setString(7, cgs.getFlightETP());
            ps.setString(8, cgs.getFlightBTP());
            ps.setString(9, cgs.getFlightDate());
            ps.setString(10, cgs.getFlightSeatRows());
            ps.setString(11, cgs.getFlightSeatCols());
            ps.setString(12, cgs.getFlightDepature());
            ps.setString(13, cgs.getFlightArrival());
            ps.setString(14, cgs.getFlightDuration());
            ps.setString(15, cgs.getFlightRunway());
            ps.setString(16, cgs.getFlightImage());

            ps.executeUpdate();

        } catch (SQLException e) {

e.printStackTrace();
        }

    }

    public void delete(int pid) {
        try {

            Connection conn = load.Load.getInstance().getConnection();

            String query = "delete from flight where id = ? ";

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, pid);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List getcar_info() {

        List list = new ArrayList<>();
        try {

            Connection conn = load.Load.getInstance().getConnection();

            String query = "select * from flight";

            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                flightgettersetter cgs = new flightgettersetter();

                cgs.setId(rs.getInt(1));

                cgs.setFlightName(rs.getString(2));
                cgs.setFlightNumber(rs.getString(3));
                cgs.setFlightState(rs.getString(4));
                cgs.setFlightFrom(rs.getString(5));
                cgs.setFlightTo(rs.getString(6));
                cgs.setFlightDistance(rs.getString(7));
                cgs.setFlightETP(rs.getString(8));
                cgs.setFlightBTP(rs.getString(9));
                cgs.setFlightDate(rs.getString(10));
                cgs.setFlightSeatRows(rs.getString(11));
                cgs.setFlightSeatCols(rs.getString(12));
                cgs.setFlightDepature(rs.getString(13));
                cgs.setFlightArrival(rs.getString(14));
                cgs.setFlightDuration(rs.getString(15));
                cgs.setFlightRunway(rs.getString(16));
                cgs.setFlightImage(rs.getString(17));
                list.add(cgs);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;

    }

    //update code ============================================
    @Override
    public void update(flightgettersetter p) {
        try {

            Connection conn = load.Load.getInstance().getConnection();

            String query = "UPDATE  FLIGHT SET flightname=?,flightnumber=?,flightstate=?,flightfrom=?,flightto=?,"
                    + "flightdistance=?,flightetp=?,flightbtp=?,flightdate=?,flightseatrows=?,flightseatcols=?,flightdepature=?,flightarrival=?,flightduration=?,flighrunway=?,flightimage=?, WHERE id =" + p.getId();

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, p.getFlightName());
            ps.setString(2, p.getFlightNumber());
            ps.setString(3, p.getFlightState());
            ps.setString(4, p.getFlightFrom());
            ps.setString(5, p.getFlightTo());
            ps.setString(6, p.getFlightDistance());
            ps.setString(7, p.getFlightETP());
            ps.setString(8, p.getFlightBTP());
            ps.setString(9, p.getFlightDate());
            ps.setString(10, p.getFlightSeatRows());
            ps.setString(11, p.getFlightSeatCols());
            ps.setString(12, p.getFlightDepature());
            ps.setString(13, p.getFlightArrival());
            ps.setString(14, p.getFlightDuration());
            ps.setString(15, p.getFlightRunway());
            ps.setString(16, p.getFlightImage());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
flightgettersetter p;
    @Override
    public flightgettersetter getflightgettersetter(int pid) {
       
        try {

            Connection conn = load.Load.getInstance().getConnection();

            String query = "select * from FLIGHT where id = ?";

            PreparedStatement ps = conn.prepareStatement(query);

            
            ps.setInt(1, pid);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                p = new flightgettersetter();

                p.setId(rs.getInt("ID"));
                p.setFlightName(rs.getString(2));
                p.setFlightNumber(rs.getString(3));
                p.setFlightState(rs.getString(4));
                p.setFlightFrom(rs.getString(5));
                p.setFlightTo(rs.getString(6));
                p.setFlightDistance(rs.getString(7));
                p.setFlightETP(rs.getString(8));
                p.setFlightBTP(rs.getString(9));
                p.setFlightDate(rs.getString(10));
                p.setFlightSeatRows(rs.getString(11));
                p.setFlightSeatCols(rs.getString(12));
                p.setFlightDepature(rs.getString(13));
                p.setFlightArrival(rs.getString(14));
                p.setFlightDuration(rs.getString(15));
                p.setFlightRunway(rs.getString(16));
                p.setFlightImage(rs.getString(17));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return p;
    }

}
