package com.spider.mapper;

import org.dozer.DozerBeanMapper;

import java.util.*;

/**
 * @author lxx
 * @Date: 2016/11/8 15:01
 * @Email: sking66@163.com
 * @Description:* 简单封装Dozer, 实现深度转换Bean<->Bean的Mapper,参数名一样自动映射,参数名不一样需要在xml里声明映射关系.实现:
 *                  1. 持有Mapper的单例.
 *                  2. 返回值类型转换.
 *                  3. 批量转换Collection中的所有对象.
 *                  4. 区分创建新的B对象与将对象A值复制到已存在的B对象两种函数.
 */
public class BeanMapper {

    /**
     * 持有Dozer单例, 避免重复创建DozerMapper消耗资源.
     */
    private static final DozerBeanMapper DOZER = new DozerBeanMapper(Arrays.asList(new String[]{"dozer/oms-dozer-mapping.xml"}));

    /**
     * 基于Dozer转换对象的类型.
     * @param source            原数据源
     * @param destinationClass  目标转换类型
     * @return
     */
    public static <T> T map(Object source, Class<T> destinationClass) {
        return DOZER.map(source, destinationClass);
    }

    /**
     * 基于Dozer转换Collection中对象的类型.
     * @param sourceList        原数据集合
     * @param destinationClass  目标转换类型
     * @return
     */
    public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
        List<T> destinationList = new ArrayList<>();
        for (Object sourceObject : sourceList) {
            T destinationObject = DOZER.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }

    /**
     * 基于Dozer转换Page中对象的类型.
     * @param sourcePage        原数据分页集合
     * @param destinationClass  目标转换类型
     * @return
     */
    /*public static <T> PageInfo<T> mapPage(PageInfo sourcePage, Class<T> destinationClass) {
        PageInfo<T> dtoPage = new PageInfo<T>();

        dtoPage.setPageSize(sourcePage.getPageSize());
        dtoPage.setPageNum(sourcePage.getPageNum());
        dtoPage.setTotal(sourcePage.getTotal());
        dtoPage.setList(mapList(sourcePage.getList(), destinationClass));

        return dtoPage;
    }*/

    /**
     *
     * @param sourceMap         源Map
     * @param destinationClass  目标类型
     * @param <K> K必须与resourceMap的key类型相同
     * @param <T>
     * @return
     */
    public static <K,T> Map<K,T> mapHashMap(Map sourceMap, Class<T> destinationClass) {
        Map<K,T> destinationMap = new HashMap<>();
        for (Object o : sourceMap.keySet()) {
            T destinationObject = DOZER.map(sourceMap.get(o), destinationClass);
            K destinationKey = (K) o;
            destinationMap.put(destinationKey,destinationObject);
        }
        return destinationMap;
    }
    /**
     * 基于Dozer将对象A的值拷贝到对象B中.
     */
    public static void copy(Object source, Object destinationObject) {
        DOZER.map(source, destinationObject);
    }
}

