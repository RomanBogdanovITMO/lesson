package lesson16omework.Task02;


import patterns.observer.Listener;

import java.util.ArrayList;
import java.util.List;

/**2. Реализовать сигнализации, реагирующие на повышение температуры (паттерн observer).
 Класс Sensor инкрементально повышает температуру, и на каждое изменение температуры оповещает слушателей (сигнализации).
 Их должно быть три, соответствующие уровням тревоги: Green (100), Yellow (300), Red (600).

 Описываете интерфейс Alarm, имеющий метод void tempChanged(int temp), и подписываете три реализации к датчику на оповещения.

 Сигнализации сработают по преодолению определенного порога температуры:
 100 градусов - Green
 300 градусов - Green, Yellow
 600 градусов - Green, Yellow, Red

 Срабатывание - вывод в консоль сообщения. Если сигнализация сработала, то сообщение не повторяется на дальнейшее повышение температуры,
 но если опустится ниже порога, а потом опять преодолеет, то выведется снова.*/

public class Sensor {
     private int temp = 0;
    private List<Alarm> list = new ArrayList<>();

    public void addList(Alarm alarm){
        list.add(alarm);
    }
    public void DeleteListener(Alarm alarm){
        list.remove(alarm);
    }
    public void newTemp(){
        for(int i = 0; i <=100; i++){
            temp++;
            notifyAlarms(temp);
        }
    }
    public void notifyAlarms(int t){
        for (Alarm alarms: list){
            alarms.tempChanged(t);
        }
    }

    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.addList(new Alarm() {
            @Override
            public void tempChanged(int temp) {
                if(temp == 100){
                    System.out.println(temp + " градусов - Green");
                } }
        });
        sensor.addList(new Alarm() {
            @Override
            public void tempChanged(int temp) {
                if (temp == 300){
                    System.out.println(temp + " градусов - Green, Yellow");}
            }
        });
        sensor.addList(new Alarm() {
            @Override
            public void tempChanged(int temp) {
                if(temp == 600){
                    System.out.println( temp + " градусов - Green, Yellow, Red");
                }
            }
        });
        sensor.newTemp();
    }
}
