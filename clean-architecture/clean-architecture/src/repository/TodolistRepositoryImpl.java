package repository;

import entity.Todolist;

//public class TodolistRepositoryImpl implements TodolistRepository{
//
//    public Todolist[]data = new Todolist[10];
//    public boolean isFull(){
//        var isfull = true;
//        for (Todolist datum : data) {
//            if (datum == null) {
//                isfull = false;
//                break;
//            }
//
//        }
//        return isfull;
//    }
//    @Override
//    public Todolist[] getAll() {
//        return data;
//    }
//    public void resizeIsFull(){
//        if(!isFull()){
//            var temp = data;
//            data = new Todolist[data.length*2];
//            for (int i = 0; i < temp.length ; i++) {
//                data[i] = temp[i];
//
//            }
//        }
//    }
//    @Override
//    public void add(Todolist todolist) {
//    //cek model apakah kosong
//        resizeIsFull();
//        for (int i = 0; i < data.length ; i++) {
//            if(data[i]==null){
//                data[i] = todolist;
//                break;
//            }
//        }
//    }
//
//    @Override
//    public boolean remove(Integer number) {
//        if(number-1>= data.length){
//            return false;
//        } else if (data[number-1]==null) {
//            return false;
//        } else {
//            for (int i = (number-1); i < data.length; i++) {
//                if(i== data.length-1){
//                    data[number] = null;
//                }else {
//                    data[i] = data[i+1];
//                }
//            }
//        }
//        return true;
//    }
//}
