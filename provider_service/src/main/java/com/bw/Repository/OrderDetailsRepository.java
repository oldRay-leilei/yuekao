package com.bw.Repository;

import com.bw.pojo.orderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderDetailsRepository extends JpaRepository<orderDetails,Integer>, JpaSpecificationExecutor {


}
