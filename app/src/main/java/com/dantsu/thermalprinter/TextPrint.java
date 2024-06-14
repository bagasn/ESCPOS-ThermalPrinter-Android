package com.dantsu.thermalprinter;

import android.util.DisplayMetrics;

import com.dantsu.escposprinter.EscPosPrinter;
import com.dantsu.escposprinter.textparser.PrinterTextParserImg;
import com.dantsu.thermalprinter.async.AsyncEscPosPrinter;

import java.util.Date;

public class TextPrint {

    public static String text47Width() {
        return "[L]                 Kopi woles uye                 \n" +
                "[L] RSB Blok H Lt 3 no 6 Rt 008/006, penjaringan,  \n" +
                "[L]  Jakarta Utara, DKI Jakarta, Indonesia 14440   \n" +
                "[L]              Phone: 082226811399               \n" +
                "[L]================================================\n" +
                "[L]Date         : 15/05/2024 22:57                 \n" +
                "[L]Order Number : 150524-1                         \n" +
                "[L]Sales Type   : Normal                           \n" +
                "[L]User         : Asis Luna                        \n" +
                "[L]================================================\n" +
                "[L]x1  asis Test laporan labarugi            20.000\n" +
                "[L]    2                                           \n" +
                "[L]x1  AVOCADO CHOCOLATE JUICE               12.000\n" +
                "[L]    250ML                                       \n" +
                "[L]x1  AVOCADO CHOCOLATE JUICE               20.000\n" +
                "[L]    500ML                                       \n" +
                "[L]x1  AVOCADO CREAM CHEESE 150ML            10.000\n" +
                "[L]x1  AVOCADO CREAM CHEESE 150ML            10.000\n" +
                "[L]x1  Avocado Ice Cream                     27.000\n" +
                "[L]x2  AVOCADO CREAM CHEESE 200ML            24.000\n" +
                "[L]x1  AVOCADO CREAM CHEESE 200ML            12.000\n" +
                "[L]x1  AVOCADO RED DRAGON JUICE              12.000\n" +
                "[L]------------------------------------------------\n" +
                "[L]Subtotal                                 454.500\n" +
                "[L]Service Charge (5%)                       22.225\n" +
                "[L]Tax                                    40.490,99\n" +
                "[L]Total                                    476.725\n" +
                "[L]------------------------------------------------\n" +
                "[L]facebook: dwiabdulaziz                          \n" +
                "[L]instagram: dwi_abdul_aziz                       \n" +
                "[L]twitter: Okejer                                 \n" +
                "[L]email: azizlunapos@gmail.com                    \n" +
                "[L]================================================\n" +
                "[L]        ** INI BUKAN BUKTI PEMBAYARAN **        \n" +
                "[L]================================================";
    }

    public static String printTokai(AsyncEscPosPrinter printer, String image) {
        return "[C]<img>" + image + "</img>\n" +
                "[L]\n" +
                "[L]                 Kopi woles uye                 \n" +
                "[L] RSB Blok H Lt 3 no 6 Rt 008/006, penjaringan,  \n" +
                "[L]  Jakarta Utara, DKI Jakarta, Indonesia 14440   \n" +
                "[L]              Phone: 082226811399               \n" +
                "[L]================================================\n" +
                "[L]Date         : 15/05/2024 22:57                 \n" +
                "[L]Order Number : 150524-1                         \n" +
                "[L]Sales Type   : Normal                           \n" +
                "[L]User         : Asis Luna                        \n" +
                "[L]================================================\n" +
                "[L]x1  asis Test laporan labarugi            20.000\n" +
                "[L]    2                                           \n" +
                "[L]x1  AVOCADO CHOCOLATE JUICE               12.000\n" +
                "[L]    250ML                                       \n" +
                "[L]x1  AVOCADO CHOCOLATE JUICE               20.000\n" +
                "[L]    500ML                                       \n" +
                "[L]x1  AVOCADO CREAM CHEESE 150ML            10.000\n" +
                "[L]x1  AVOCADO CREAM CHEESE 150ML            10.000\n" +
                "[L]x1  Avocado Ice Cream                     27.000\n" +
                "[L]x2  AVOCADO CREAM CHEESE 200ML            24.000\n" +
                "[L]x1  AVOCADO CREAM CHEESE 200ML            12.000\n" +
                "[L]x1  AVOCADO RED DRAGON JUICE              12.000\n" +
                "[L]------------------------------------------------\n" +
                "[L]Subtotal                                 454.500\n" +
                "[L]Service Charge (5%)                       22.225\n" +
                "[L]Tax                                    40.490,99\n" +
                "[L]Total                                    476.725\n" +
                "[L]------------------------------------------------\n" +
                "[L]facebook: dwiabdulaziz                          \n" +
                "[L]instagram: dwi_abdul_aziz                       \n" +
                "[L]twitter: Okejer                                 \n" +
                "[L]email: azizlunapos@gmail.com                    \n" +
                "[L]================================================\n" +
                "[L]        ** INI BUKAN BUKTI PEMBAYARAN **        \n" +
                "[L]================================================" +
                "[L]\n" +
                "[C]<barcode type='ean13' height='10'>831254784551</barcode>\n" +
                "[L]\n" +
                "[C]<qrcode size='20'>https://dantsu.com/</qrcode>\n" +
                "[L]\n";
    }
}
