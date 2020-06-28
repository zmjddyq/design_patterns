package com.design.prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * @author zmj
 * @date 2020/6/28 10:34
 * @Description 原型模式
 * 原型模式的优点
 * 　　原型模式允许在运行时动态改变具体的实现类型。
 * 原型模式可以在运行期间，由客户来注册符合原型接口的实现类型，
 * 也可以动态地改变具体的实现类型，看起来接口没有任何变化，
 * 但其实运行的已经是另外一个类实例了。因为克隆一个原型就类似于实例化一个类。
 * <p>
 * 原型模式的缺点
 * 　　原型模式最主要的缺点是每一个类都必须配备一个克隆方法。
 * 配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类来说不是很难，
 * 而对于已经有的类不一定很容易，特别是当一个类引用不支持序列化的间接对象，
 * 或者引用含有循环结构的时候。
 */
public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep();
        System.out.println("*********************浅克隆测试*******************");
        Sheep cloneSheep1 = (Sheep) sheep.clone();
        Sheep cloneSheep2 = (Sheep) sheep.clone();

        System.out.println("克隆羊一号: " + cloneSheep1);
        System.out.println("克隆羊二号: " + cloneSheep2);
        System.out.println("克隆的对象是否相等: " + cloneSheep1.equals(cloneSheep2));
        System.out.println("克隆的对象的羊朋友是否相等： " + cloneSheep1.getFriend().equals(cloneSheep2.getFriend()));

        System.out.println("*********************深克隆测试1*******************");
        Sheep cloneSheep3 = sheep.deepClone();
        Sheep cloneSheep4 = sheep.deepClone();
        System.out.println("克隆羊一号: " + cloneSheep3);
        System.out.println("克隆羊二号: " + cloneSheep4);
        System.out.println("克隆的对象是否相等: " + cloneSheep3.equals(cloneSheep4));
        System.out.println("克隆的对象的羊朋友是否相等： " + cloneSheep3.getFriend().equals(cloneSheep4.getFriend()));

        System.out.println("*********************深克隆测试1*******************");
        Sheep cloneSheep5 = sheep.deepClone1();
        Sheep cloneSheep6 = sheep.deepClone1();
        System.out.println("克隆羊一号: " + cloneSheep5);
        System.out.println("克隆羊二号: " + cloneSheep6);
        System.out.println("克隆的对象是否相等: " + cloneSheep5.equals(cloneSheep6));
        System.out.println("克隆的对象的羊朋友是否相等： " + cloneSheep5.getFriend().equals(cloneSheep6.getFriend()));

    }
}

class Sheep implements Serializable, Cloneable {
    static final long serialVersionUID = -2660312888446371460L;
    private String name;
    private int age;
    private Sheep friend;

    /**
     * 克隆方法进行类克隆(深拷贝 方式二 -- 流方式克隆(推荐))
     * 引用对象也会进行克隆
     *
     * @return
     */
    protected Sheep deepClone1() {
        ByteArrayOutputStream os = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream is = null;
        ObjectInputStream ois = null;
        try{
            os = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(os);
            oos.writeObject(this);
            is = new ByteArrayInputStream(os.toByteArray());
            ois = new ObjectInputStream(is);
            return (Sheep) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois == null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is == null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos == null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os == null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * 克隆方法进行类克隆(深拷贝 方式一)
     * 引用对象也会进行克隆
     *
     * @return
     * @throws CloneNotSupportedException
     */
    protected Sheep deepClone() throws CloneNotSupportedException {
        Sheep cloneSheep = (Sheep) super.clone();
        cloneSheep.setFriend((Sheep) this.friend.clone());
        return cloneSheep;
    }

    /**
     * 重写克隆方法进行类克隆(浅拷贝)
     * 只对基本数据类型进行克隆
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep() {
        this.name = "多利";
        this.age = 1;
        this.friend = new Sheep("少利", 1, null);
    }

    public Sheep(String name, int age, Sheep friend) {
        this.name = name;
        this.age = age;
        this.friend = friend;
    }
}