
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
public class Main
{
    Reader rm=new Reader();
    public void main () throws IOException {
        try {
            //System.out.println("Porfavor ingrese la direccion donde se encuentran las coordenadas de las abejas");
            //Scanner dir=new Scanner(System.in);
            //String direccion=dir.nextLine();
            ArrayList<Long> a=new ArrayList();
            for (int i=0;i<13;++i) {
                long ab=0;
                a.add(ab);
            }
            ArrayList<Long> memoria=new ArrayList();
            for (int i=0;i<13;++i) {
                long ab=0;
                memoria.add(ab);
            }
            for (int i=0;i<100;++i) {
                System.out.println(i);
                long start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("4Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                long tiempo=System.currentTimeMillis()-start;
                long ti=a.get(0)+tiempo;
                a.add(0,ti);
                a.remove(1);
                start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("10Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                tiempo=System.currentTimeMillis()-start;
                ti=a.get(1)+tiempo;
                a.add(1,ti);
                a.remove(2);
                start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("15Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                tiempo=System.currentTimeMillis()-start;
                ti=a.get(2)+tiempo;
                a.add(2,ti);
                a.remove(3);
                start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("100Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                tiempo=System.currentTimeMillis()-start;
                ti=a.get(3)+tiempo;
                a.add(3,ti);
                a.remove(4);
                start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("150Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                tiempo=System.currentTimeMillis()-start;
                ti=a.get(4)+tiempo;
                a.add(4,ti);
                a.remove(5);
                start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("1000Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                tiempo=System.currentTimeMillis()-start;
                ti=a.get(5)+tiempo;
                a.add(5,ti);
                a.remove(6);
                start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("1500Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                tiempo=System.currentTimeMillis()-start;
                ti=a.get(6)+tiempo;
                a.add(6,ti);
                a.remove(7);
                start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("10000Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                tiempo=System.currentTimeMillis()-start;
                ti=a.get(7)+tiempo;
                a.add(7,ti);
                a.remove(8);
                start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("15000Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                tiempo=System.currentTimeMillis()-start;
                ti=a.get(8)+tiempo;
                a.add(8,ti);
                a.remove(9);
                start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("100000Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                tiempo=System.currentTimeMillis()-start;
                ti=a.get(9)+tiempo;
                a.add(9,ti);
                a.remove(10);
                start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("150000Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                tiempo=System.currentTimeMillis()-start;
                ti=a.get(10)+tiempo;
                a.add(10,ti);
                a.remove(11);
                start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("1000000Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                tiempo=System.currentTimeMillis()-start;
                ti=a.get(11)+tiempo;
                a.add(11,ti);
                a.remove(12);
                start=System.currentTimeMillis();
                if (i==0) {
                    System.gc();
                }
                rm.leer("1500000Abejas.txt");
                if (i==0) {
                    Runtime rt=Runtime.getRuntime();
                    long usedMB=(rt.totalMemory()-rt.freeMemory())/1024/1024;
                    memoria.add(0,usedMB);
                    System.out.println("Memory Usage:"+usedMB);
                }
                tiempo=System.currentTimeMillis()-start;
                ti=a.get(12)+tiempo;
                a.add(12,ti);
                a.remove(13);
            }
            for (int i=0;i<13;++i) {
                long promedio=a.get(i)/100;
                System.out.println(promedio);
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

