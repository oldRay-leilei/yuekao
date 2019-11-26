package com.bw.Repository;

import com.bw.pojo.orderDetails;
import com.bw.pojo.orderManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderManagementRepository extends JpaRepository<orderManagement,Integer>, JpaSpecificationExecutor {




}
