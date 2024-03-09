package utils;

import models.User;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;
import java.util.List;
public class PrintAsTable {

    public static void menu() {
        System.out.println("=".repeat(141));
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
        CellStyle cellCenter = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0,139,139);
        table.addCell("Welcome to User Management System",cellCenter);
        table.addCell(" ".repeat(60)+"1. Add User");
        table.addCell(" ".repeat(60)+"2. View All User");
        table.addCell(" ".repeat(60)+"3. Search User");
        table.addCell(" ".repeat(60)+"4. Update User");
        table.addCell(" ".repeat(60)+"5. Set verify to User");
        table.addCell(" ".repeat(60)+"6. Delete User");
        table.addCell(" ".repeat(60)+"7. Exit");
        System.out.println(table.render());
        System.out.println("=".repeat(141));
    }
    public static void printAsTable(List<User> userList) {
        System.out.println();
        Table table = new Table(6, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        table.setColumnWidth(0,10,10);
        table.setColumnWidth(1,40,40);
        table.setColumnWidth(2,22,30);
        table.setColumnWidth(3,25,35);
        table.setColumnWidth(4,22,25);
        table.setColumnWidth(5,15,15);
        CellStyle cellCenter = new CellStyle(CellStyle.HorizontalAlign.center);

        table.addCell("USER ID", cellCenter);
        table.addCell("USER UUID", cellCenter);
        table.addCell("USER NAME", cellCenter);
        table.addCell("USER EMAIL", cellCenter);
        table.addCell("USER PASSWORD", cellCenter);
        table.addCell("USER VERIFIED", cellCenter);

        userList.forEach(user -> {
            table.addCell(user.getUserId().toString(), cellCenter);
            table.addCell(user.getUserUuid(), cellCenter);
            table.addCell(user.getUserName(), cellCenter);
            table.addCell(user.getUserEmail(), cellCenter);
            table.addCell(user.getUserPassword(), cellCenter);
            table.addCell(user.getIsVerified() ? "Yes" : "No", cellCenter);
        });

        System.out.println(table.render());
        System.out.println();
    }

    public static void printAsTableOneUser(User user) {
        System.out.println();
        Table table = new Table(6, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        table.setColumnWidth(0,10,10);
        table.setColumnWidth(1,40,40);
        table.setColumnWidth(2,22,30);
        table.setColumnWidth(3,25,35);
        table.setColumnWidth(4,22,25);
        table.setColumnWidth(5,15,15);
        CellStyle cellCenter = new CellStyle(CellStyle.HorizontalAlign.center);

        if (user == null || user.getIsVerified() == null) {
            System.out.println("User not found");
            return;
        }

        table.addCell("USER ID", cellCenter);
        table.addCell("USER UUID", cellCenter);
        table.addCell("USER NAME", cellCenter);
        table.addCell("USER EMAIL", cellCenter);
        table.addCell("USER PASSWORD", cellCenter);
        table.addCell("USER VERIFIED", cellCenter);

        addCellWithNullCheck(table, user.getUserId(), cellCenter);
        addCellWithNullCheck(table, user.getUserUuid(), cellCenter);
        addCellWithNullCheck(table, user.getUserName(), cellCenter);
        addCellWithNullCheck(table, user.getUserEmail(), cellCenter);
        addCellWithNullCheck(table, user.getUserPassword(), cellCenter);
        addCellWithNullCheck(table, user.getIsVerified()? "Yes" : "No", cellCenter);

        System.out.println(table.render());
        System.out.println();
    }

    private static void addCellWithNullCheck(Table table, Object value, CellStyle style) {
        if (value != null) {
            table.addCell(value.toString(), style);
        } else {
            table.addCell("", style);
        }
    }

}