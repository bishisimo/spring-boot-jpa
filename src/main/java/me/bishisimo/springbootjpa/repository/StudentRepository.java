package me.bishisimo.springbootjpa.repository;

import me.bishisimo.springbootjpa.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long>, JpaSpecificationExecutor<Student> {

    @Query("select u from Student u where u.studentId =?1")
    Student findStudentById(Long id);

    @Query("select u from Student u where u.studentName =?1")
    List<Student> findStudentByName(String name);

    @Query("select u from Student u where u.studentAge =?1")
    List<Student> findStudentByAge(int age);

//    @Query("select userName,createTime from UserBean where userName =?1")
//    List<Object> find_Jpql_list_morefield(String username);
//
//    @Query("select userName,createTime from UserBean ")
//    List<Object> find_Jpql_list_pojo_morefield();

    /**
     * 若返回类型为POJO，必须是所有POJO的所有字段，不能只查询某个字段
     */
//    @Query(value="select * from cyd_sys_user",nativeQuery=true)
//    List<UserBean> find_SQL_pojo();
//
//    @Query(value="select user_name,name from cyd_sys_user,t_user",nativeQuery=true)
//    List<Object> find_SQL_obj();
//
//　　@Query(value = "select new map(userName,createTime) from UserBean")
//    List<Map<String,Object>> find_SQL_obj_map();

    /**
     * 分页需要 #pageable 标识
     * NativeJpaQuery
     * @param pageable
     * @return
     */
//    @Query(value="select user_name,name from cyd_sys_user,t_user  /*#pageable*/  ",countQuery="select count(*) from cyd_sys_user,t_user",nativeQuery=true)
//    Page<Object> find_SQL_obj(Pageable pageable);
}
