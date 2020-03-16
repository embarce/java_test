package Digital_factory;

/**
 *
 *商品列表类
 * chenhaowei
 * 2020年3月4日 13:52:29
 * 把所有都当成最后一个节点，最开始的节点是父亲节点应该father为0记录下来。
 *
 */
public class Commodity {
    /**
     * 记录商品id
     */
    private int ID;
    /**
     * 判断是不是子节点
     */
    private int isSoon;
    /**
     * 记录他的父节点
     */
    private int father;
    /**
     * 商品名字
     */
    private String name;

    /**
     * 记录时间
     *
     */
    private String creatTime;

    /**
     *记录谁创建
     *
     */
    private String creatUser;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 谁更新
     */
    private String updateUser;

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getCreatUser() {
        return creatUser;
    }

    public void setCreatUser(String creatUser) {
        this.creatUser = creatUser;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIsSoon() {
        return isSoon;
    }

    public void setIsSoon(int isSoon) {
        this.isSoon = isSoon;
    }

    public int getFather() {
        return father;
    }

    public void setFather(int father) {
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
