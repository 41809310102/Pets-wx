package com.example.newadmin.domain;

import lombok.Data;



/**
 * 预约信息对象 pt_order
 *
 * @author root
 * @date 2023-01-27
 */
@Data
public class PtOrder
{
    private static final long serialVersionUID = 1L;

    /**  */

    private Long id;

    /**  */

    private Long uid;

    /**  */

    private String username;

    /**  */

    private String orderTime;

    /**  */

    private Long price;

    /**  */
    private String phone;

    /**  */
    private String fuwuName;

    /**  */
    private String hospName;

    /**  */
    private Long state;

    /**  */
    private String yuyueTime;

}
