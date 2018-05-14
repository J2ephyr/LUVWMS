/*
Navicat MySQL Data Transfer
Source Server Version : 50720
Source Database       : luv_wms
Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-14 11:32:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_operator
-- ----------------------------
DROP TABLE IF EXISTS `sys_operator`;
CREATE TABLE `sys_operator` (
  `ID` decimal(10,0) NOT NULL COMMENT '主键',
  `NO` varchar(50) DEFAULT NULL COMMENT '帐号',
  `PASSWORD` varchar(50) DEFAULT NULL COMMENT '密码',
  `NAME` varchar(50) DEFAULT NULL COMMENT '名称',
  `ADDRESS` varchar(256) DEFAULT NULL COMMENT '地址',
  `PHONE` decimal(11,0) DEFAULT NULL COMMENT '联系电话',
  `SEX` varchar(10) DEFAULT NULL COMMENT '性别',
  `FLAG` decimal(5,0) DEFAULT NULL COMMENT '状态',
  `OPRT_NO` decimal(10,0) DEFAULT NULL COMMENT '创建人ID',
  `OPRT_NAME` varchar(50) DEFAULT NULL COMMENT '创建人',
  `OPRT_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='人员';

-- ----------------------------
-- Records of sys_operator
-- ----------------------------
INSERT INTO `sys_operator` VALUES ('1', 'admin', 'YQfx7w7DCS9w1dzJXsf+Rw==', '系统管理员', '浙江省杭州市', '18888888888', '1', '1', null, null, null);
INSERT INTO `sys_operator` VALUES ('2', 'user', 'YQfx7w7DCS9w1dzJXsf+Rw==', '测试用户', '浙江省杭州市', '17777777777', '1', '1', null, null, '2018-02-13 18:28:28');

-- ----------------------------
-- Table structure for sys_oprt_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_oprt_role`;
CREATE TABLE `sys_oprt_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `oprt_no` varchar(64) DEFAULT NULL COMMENT '用户账号',
  `role_no` varchar(64) DEFAULT NULL COMMENT '角色编号',
  `gmt_create` date DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户-角色';

-- ----------------------------
-- Records of sys_oprt_role
-- ----------------------------
INSERT INTO `sys_oprt_role` VALUES ('1', 'admin', '1', '2018-02-10');
INSERT INTO `sys_oprt_role` VALUES ('2', 'user', '2', '2018-02-24');

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permission_no` int(11) DEFAULT NULL COMMENT '权限编号',
  `permission_name` varchar(64) DEFAULT NULL COMMENT '权限名称',
  `permission_desc` varchar(128) DEFAULT NULL COMMENT '权限描述',
  `permission_icon` varchar(64) DEFAULT NULL COMMENT '图标',
  `permission_url` varchar(64) DEFAULT NULL COMMENT '权限url路径',
  `permission_pid` int(11) DEFAULT NULL COMMENT '父id',
  `is_leaf` varchar(1) DEFAULT NULL COMMENT '是否叶子节点',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COMMENT='权限';

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('14', '10001', '商品管理', '商品管理', 'item', '/goods', '0', '0');
INSERT INTO `sys_permission` VALUES ('15', '1000101', '商品列表', '商品列表', null, '/goods/list', '10001', '1');
INSERT INTO `sys_permission` VALUES ('16', '1000102', '新增商品', '新增商品', null, '/goods/create', '10001', '1');
INSERT INTO `sys_permission` VALUES ('17', '10002', '入库管理', '入库管理', 'forward', '/inStock', '0', '0');
INSERT INTO `sys_permission` VALUES ('18', '1000201', '入库管理列表', '入库管理列表', null, '/inStock/list', '10002', '1');
INSERT INTO `sys_permission` VALUES ('19', '10003', '出库管理', '出库管理', 'backward', '/outStock', '0', '0');
INSERT INTO `sys_permission` VALUES ('20', '1000301', '订单管理', '订单管理', null, '/outStock/orders', '10003', '1');
INSERT INTO `sys_permission` VALUES ('21', '1000302', '出库单列表', '出库单列表', null, '/outStock/list', '10003', '1');
INSERT INTO `sys_permission` VALUES ('22', '10004', '库存管理', '库存管理', 'compass', '/stock', '0', '0');
INSERT INTO `sys_permission` VALUES ('23', '1000401', '库存列表', '库存列表', null, '/stock/list', '10004', '1');
INSERT INTO `sys_permission` VALUES ('24', '10005', '权限管理', '权限管理', 'yonghu', '/authority', '0', '0');
INSERT INTO `sys_permission` VALUES ('25', '1000501', '人员维护', '人员维护', null, '/authority/operator', '10005', '1');
INSERT INTO `sys_permission` VALUES ('26', '1000502', '角色维护', '角色维护', null, '/authority/role', '10005', '1');
INSERT INTO `sys_permission` VALUES ('27', '1000503', '角色权限分配', '角色权限分配', null, '/authority/roleAssianment', '10005', '1');
INSERT INTO `sys_permission` VALUES ('28', '10006', '系统管理', '系统管理', 'repair', '/sys', '0', '0');
INSERT INTO `sys_permission` VALUES ('29', '1000601', '库区管理', '库区管理', null, '/sys/StorageArea', '10006', '1');
INSERT INTO `sys_permission` VALUES ('30', '1000602', '库位管理', '库位管理', null, '/sys/StorageLocation', '10006', '1');
INSERT INTO `sys_permission` VALUES ('31', '1000603', '数据字典', '数据字典', null, '/sys/dictionary', '10006', '1');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_no` int(11) DEFAULT NULL COMMENT '角色编号',
  `role_name` varchar(64) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '1', 'role_admin');
INSERT INTO `sys_role` VALUES ('2', '2', 'role_user');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_no` int(11) DEFAULT NULL COMMENT '角色编号',
  `permission_no` int(11) DEFAULT NULL COMMENT '权限编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='角色-权限';

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('14', '1', '1000101');
INSERT INTO `sys_role_permission` VALUES ('15', '1', '1000102');
INSERT INTO `sys_role_permission` VALUES ('20', '1', '10001');
INSERT INTO `sys_role_permission` VALUES ('21', '1', '10002');
INSERT INTO `sys_role_permission` VALUES ('22', '1', '1000201');
INSERT INTO `sys_role_permission` VALUES ('23', '1', '10003');
INSERT INTO `sys_role_permission` VALUES ('24', '1', '1000301');
INSERT INTO `sys_role_permission` VALUES ('25', '1', '1000302');
INSERT INTO `sys_role_permission` VALUES ('26', '1', '10004');
INSERT INTO `sys_role_permission` VALUES ('27', '1', '1000401');
INSERT INTO `sys_role_permission` VALUES ('28', '1', '10005');
INSERT INTO `sys_role_permission` VALUES ('29', '1', '1000501');
INSERT INTO `sys_role_permission` VALUES ('30', '1', '1000502');
INSERT INTO `sys_role_permission` VALUES ('31', '1', '1000503');
INSERT INTO `sys_role_permission` VALUES ('32', '1', '10006');
INSERT INTO `sys_role_permission` VALUES ('33', '1', '1000601');
INSERT INTO `sys_role_permission` VALUES ('34', '1', '1000602');
INSERT INTO `sys_role_permission` VALUES ('35', '1', '1000603');
INSERT INTO `sys_role_permission` VALUES ('36', '2', '1000101');
INSERT INTO `sys_role_permission` VALUES ('37', '2', '1000102');
INSERT INTO `sys_role_permission` VALUES ('38', '2', '10001');
INSERT INTO `sys_role_permission` VALUES ('39', '2', '10002');
INSERT INTO `sys_role_permission` VALUES ('40', '2', '1000201');
INSERT INTO `sys_role_permission` VALUES ('41', '2', '10003');
INSERT INTO `sys_role_permission` VALUES ('42', '2', '1000301');
INSERT INTO `sys_role_permission` VALUES ('43', '2', '1000302');
INSERT INTO `sys_role_permission` VALUES ('44', '2', '10004');
INSERT INTO `sys_role_permission` VALUES ('45', '2', '1000401');
INSERT INTO `sys_role_permission` VALUES ('50', '2', '10006');
INSERT INTO `sys_role_permission` VALUES ('51', '2', '1000601');
INSERT INTO `sys_role_permission` VALUES ('52', '2', '1000602');
INSERT INTO `sys_role_permission` VALUES ('53', '2', '1000603');

-- ----------------------------
-- Table structure for wms_base_dictionary
-- ----------------------------
DROP TABLE IF EXISTS `wms_base_dictionary`;
CREATE TABLE `wms_base_dictionary` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `rid` varchar(64) DEFAULT NULL COMMENT '字典编号',
  `para_id` varchar(64) DEFAULT NULL COMMENT '参数值',
  `text` varchar(128) DEFAULT NULL COMMENT '参数名称',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `pid` varchar(64) DEFAULT NULL COMMENT '父节点',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=409 DEFAULT CHARSET=utf8 COMMENT='数据字典表';

-- ----------------------------
-- Records of wms_base_dictionary
-- ----------------------------
INSERT INTO `wms_base_dictionary` VALUES ('379', '10001', '10001', '布尔值', '布尔值(是，否）', '0', '2018-04-02 15:14:14', '2018-04-21 17:28:15');
INSERT INTO `wms_base_dictionary` VALUES ('380', '1000101', '1', '是', '是', '10001', '2018-04-02 15:14:37', null);
INSERT INTO `wms_base_dictionary` VALUES ('381', '1000102', '2', '否', '否', '10001', '2018-04-02 15:14:54', null);
INSERT INTO `wms_base_dictionary` VALUES ('382', '10002', '10002', '入库单状态', '入库单状态', '0', '2018-04-02 15:50:57', '2018-04-21 17:07:05');
INSERT INTO `wms_base_dictionary` VALUES ('383', '1000201', '10', '新建', null, '10002', '2018-04-02 15:51:08', '2018-04-02 15:52:42');
INSERT INTO `wms_base_dictionary` VALUES ('384', '1000202', '11', '已到货', null, '10002', '2018-04-02 15:51:21', '2018-04-02 15:52:42');
INSERT INTO `wms_base_dictionary` VALUES ('385', '1000203', '12', '已理货', null, '10002', '2018-04-02 15:51:29', '2018-04-02 15:52:43');
INSERT INTO `wms_base_dictionary` VALUES ('386', '1000204', '13', '已上架', null, '10002', '2018-04-02 15:51:39', '2018-04-02 15:52:43');
INSERT INTO `wms_base_dictionary` VALUES ('387', '1000205', '14', '入库完成', null, '10002', '2018-04-02 15:51:48', '2018-04-02 15:52:44');
INSERT INTO `wms_base_dictionary` VALUES ('388', '1000206', '18', '已关闭', null, '10002', '2018-04-02 15:52:06', '2018-04-02 15:52:46');
INSERT INTO `wms_base_dictionary` VALUES ('389', '10003', '10003', '仓库', null, '0', '2018-04-10 13:20:40', '2018-04-21 17:07:06');
INSERT INTO `wms_base_dictionary` VALUES ('390', '1000301', '000001', '测试仓库1', '测试仓库1', '10003', '2018-04-10 13:21:30', null);
INSERT INTO `wms_base_dictionary` VALUES ('391', '1000302', '000002', '测试仓库2', '测试仓库2', '10003', '2018-04-10 13:21:51', null);
INSERT INTO `wms_base_dictionary` VALUES ('392', '1000303', '000003', '测试仓库3', '测试仓库3', '10003', '2018-04-10 13:22:38', null);
INSERT INTO `wms_base_dictionary` VALUES ('393', '10004', '10004', '订单状态', '订单状态', '0', '2018-04-17 19:01:14', '2018-04-21 17:07:07');
INSERT INTO `wms_base_dictionary` VALUES ('394', '1000401', '21', '初始化', '初始化', '10004', '2018-04-17 19:02:04', '2018-04-17 19:02:03');
INSERT INTO `wms_base_dictionary` VALUES ('395', '1000402', '22', '拣货完成', '拣货完成', '10004', '2018-04-17 19:02:30', null);
INSERT INTO `wms_base_dictionary` VALUES ('396', '1000403', '23', '已发货', '已发货', '10004', '2018-04-17 19:02:52', null);
INSERT INTO `wms_base_dictionary` VALUES ('397', '1000404', '24', '已收货', '收货', '10004', '2018-04-17 19:03:17', null);
INSERT INTO `wms_base_dictionary` VALUES ('398', '1000405', '28', '订单关闭', '订单关闭', '10004', '2018-04-17 19:03:46', null);
INSERT INTO `wms_base_dictionary` VALUES ('399', '1000501', '31', '新建', '新建', '10005', '2018-04-17 19:04:23', null);
INSERT INTO `wms_base_dictionary` VALUES ('400', '10005', '10005', '出库单状态', null, '0', '2018-04-17 19:04:47', '2018-04-21 17:07:08');
INSERT INTO `wms_base_dictionary` VALUES ('401', '1000502', '32', '已拣货', '已拣货', '10005', '2018-04-17 19:05:06', null);
INSERT INTO `wms_base_dictionary` VALUES ('402', '1000503', '38', '已关闭', '已关闭', '10005', '2018-04-17 19:05:31', null);
INSERT INTO `wms_base_dictionary` VALUES ('403', '10006', '10006', '性别', '性别', '0', '2018-04-20 20:28:39', '2018-04-21 17:07:10');
INSERT INTO `wms_base_dictionary` VALUES ('404', '1000601', '1', '男', '男', '10006', '2018-04-20 20:29:06', null);
INSERT INTO `wms_base_dictionary` VALUES ('405', '1000602', '2', '女', '女', '10006', '2018-04-20 20:29:23', null);
INSERT INTO `wms_base_dictionary` VALUES ('406', '10007', '10007', '人员账号启用状态', '人员账号启用状态', '0', '2018-04-20 20:30:30', '2018-04-21 17:07:13');
INSERT INTO `wms_base_dictionary` VALUES ('407', '1000701', '1', '启用', '启用', '10007', '2018-04-20 20:30:54', '2018-04-20 20:30:52');
INSERT INTO `wms_base_dictionary` VALUES ('408', '1000702', '0', '关闭', '关闭', '10007', '2018-04-20 20:31:17', null);

-- ----------------------------
-- Table structure for wms_base_goods
-- ----------------------------
DROP TABLE IF EXISTS `wms_base_goods`;
CREATE TABLE `wms_base_goods` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `goods_no` varchar(64) DEFAULT NULL COMMENT '商品编号',
  `pn` varchar(64) DEFAULT NULL COMMENT '条形码',
  `goods_name` varchar(256) DEFAULT NULL COMMENT '商品名称',
  `goods_brief` varchar(256) DEFAULT NULL COMMENT '商品简介',
  `goods_img` varchar(256) DEFAULT NULL COMMENT '商品图片',
  `goods_model` varchar(256) DEFAULT NULL COMMENT '规格',
  `goods_color` varchar(256) DEFAULT NULL COMMENT '颜色',
  `warehouse_no` varchar(64) DEFAULT NULL COMMENT '仓库',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `memo` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12702 DEFAULT CHARSET=utf8 COMMENT='商品基础信息';

-- ----------------------------
-- Records of wms_base_goods
-- ----------------------------
INSERT INTO `wms_base_goods` VALUES ('12688', '20180328021015070261', '918983133', 'SOTHEA 2017秋冬新款 高质感特定纱线欧美宽松马海毛羊毛毛衣', '', 'https://img.alicdn.com/bao/uploaded/i4/TB1GiPSinJ_SKJjSZPiYXH3LpXa_M2.SS2_100x100.jpg', 'xllll', '黄色', '1', '2018-03-28 15:07:02', '2018-04-23 16:16:52', null);
INSERT INTO `wms_base_goods` VALUES ('12689', '20180328080015072567', '9189123113', '川岛屋 日式天然玉米皮草编碗垫锅垫隔热垫茶垫加厚餐垫GD-29', '', 'https://img.alicdn.com/bao/uploaded/i3/120976213/TB2O4nSnblmpuFjSZFlXXbdQXXa_!!120976213.jpg_240x240.jpg', 'xl', '黄色', '1', '2018-03-28 15:07:25', null, null);
INSERT INTO `wms_base_goods` VALUES ('12690', '20180328045015074427', '9119123113', '日式和风深蓝素色文艺餐巾餐垫围裙锅垫隔热手套厨房桌布GD-11', '', 'https://img.alicdn.com/bao/uploaded/i3/120976213/TB2bxHGtpXXXXXVXXXXXXXXXXXX_!!120976213.jpg_240x240.jpg', 'xl', '黄色', '1', '2018-03-28 15:07:45', null, null);
INSERT INTO `wms_base_goods` VALUES ('12692', '20180330045010452181', '7768979781', '高密红皮籽圆眼正〓尼泊尔凤眼菩提手串12mm16单圈手链女雍和堂', '-- ⊙傳世佛寳 唯君獨享⊙-- 精选尼泊尔凤眼菩提为原材料，高密红皮， 手工原创设计，高端私人定制，天然宝石配饰。雍和堂经典款，一物一图。适合个人佩戴收藏，亦是馈赠佳品！', 'http://cdn.luvletter.cn/TB2PXJ_qFXXXXXPXXXXXXXXXXXX_!!14432825.jpg', '12mm16颗', '天然绿松石', '1', '2018-03-30 10:45:21', null, null);
INSERT INTO `wms_base_goods` VALUES ('12693', '20180330097010480352', '4567456324', 'Versace/范思哲VERSUS男装 秋冬新款男士时尚中长款保暖羽绒服', null, 'http://cdn.luvletter.cn/TB2SAKrawvD8KJjy0FlXXagBFXa_!!2469022358.jpg', '50', '黑色', '1', '2018-03-30 10:48:03', null, null);
INSERT INTO `wms_base_goods` VALUES ('12694', '20180402002011235641', '7634554345', 'RICK OWENS RO 18春夏新品 暗黑 潮流男士八分裤休闲裤 ', '品牌类型: 时尚潮牌材质成分: 粘胶纤维(粘纤)60% 羊毛40%裤长: 八分裤', 'http://cdn.luvletter.cn/TB2EQICXZUrBKNjSZPxXXX00pXa_!!2929245022.jpg_400x400.jpg', '46 48', '基础色（黑灰白等）', '1', '2018-04-02 11:23:57', null, null);
INSERT INTO `wms_base_goods` VALUES ('12695', '20180403023015044552', '6901939651605', '大容量商务旅行包瑞士军刀双肩包', null, 'http://cdn.luvletter.cn/3419DA545E8F0C5D.jpg', '黑色', '黑色', '1', '2018-04-03 15:04:46', null, null);
INSERT INTO `wms_base_goods` VALUES ('12696', '20180403062015060243', '6901939651607', '真皮男士双肩包时尚潮流个性街头', null, 'http://cdn.luvletter.cn/3419DA545E8F0C5D.jpg', '墨绿色', '墨绿色', '1', '2018-04-03 15:06:02', null, null);
INSERT INTO `wms_base_goods` VALUES ('12697', '20180403009015062268', '6901939651608', '现货正品Hype韩版学院风双肩包校园', null, 'http://cdn.luvletter.cn/3419DA545E8F0C5D.jpg', '蓝色', '蓝色', '1', '2018-04-03 15:06:22', null, null);
INSERT INTO `wms_base_goods` VALUES ('12698', '20180403054015063893', '6901939651609', 'Jansport杰斯伯正品双肩包超级叛逆校园', null, 'http://cdn.luvletter.cn/3419DA545E8F0C5D.jpg', '白色', '白色', '1', '2018-04-03 15:06:38', null, null);
INSERT INTO `wms_base_goods` VALUES ('12699', '20180403092015065181', '6901939651610', '牛津布双肩包女韩版潮2018新款女士', null, 'http://cdn.luvletter.cn/3419DA545E8F0C5D.jpg', '黑色111', '黑色', '1', '2018-04-03 15:06:52', '2018-04-25 14:25:30', null);
INSERT INTO `wms_base_goods` VALUES ('12700', '20180426048014205756', '84567567', 'Xiaomi/小米 笔记本Pro 15.6英寸I7 8G 256G轻薄学', null, 'http://cdn.luvletter.cn/w8YJkdNc4p.jpg', 'Pro 15.6(I7-8550U/16GB)', '银色', '1', '2018-04-26 14:20:58', null, null);
INSERT INTO `wms_base_goods` VALUES ('12701', '20180426037014260589', '9879789789', '黑轴茶轴红轴吃鸡游戏电脑有线键鼠 ', null, 'http://cdn.luvletter.cn/TB2q6kjggDD8KJjy0FdXXcjvXXa_!!1916034647.jpg', '金属灰白光(黑轴)+机械蛇', '金属灰白光(黑轴)', '1', '2018-04-26 14:26:05', null, null);

-- ----------------------------
-- Table structure for wms_base_storage_area
-- ----------------------------
DROP TABLE IF EXISTS `wms_base_storage_area`;
CREATE TABLE `wms_base_storage_area` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `area_no` varchar(32) DEFAULT NULL COMMENT '库区编号',
  `area_name` varchar(64) DEFAULT NULL COMMENT '库区名称',
  `warehouse_no` varchar(32) DEFAULT NULL COMMENT '所属仓库',
  `is_valid` char(1) DEFAULT NULL COMMENT '是否有效',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `create_user` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='库区';

-- ----------------------------
-- Records of wms_base_storage_area
-- ----------------------------
INSERT INTO `wms_base_storage_area` VALUES ('1', 'A', 'A区', '1', '1', '2018-03-28 10:51:30', null, 'admin');
INSERT INTO `wms_base_storage_area` VALUES ('2', 'B', 'B区', '1', '1', '2018-03-28 10:51:43', null, 'admin');
INSERT INTO `wms_base_storage_area` VALUES ('3', 'C', 'C区', '1', '1', '2018-03-28 10:51:53', null, 'admin');
INSERT INTO `wms_base_storage_area` VALUES ('4', 'D', 'D区', '1', '1', '2018-03-28 10:52:05', null, 'admin');
INSERT INTO `wms_base_storage_area` VALUES ('18', 'E', 'E区', '1', '1', '2018-03-30 09:30:33', null, 'admin');
INSERT INTO `wms_base_storage_area` VALUES ('19', 'F', 'F区', '1', '1', '2018-03-30 09:30:46', '2018-04-25 16:15:53', 'admin');

-- ----------------------------
-- Table structure for wms_base_storage_location
-- ----------------------------
DROP TABLE IF EXISTS `wms_base_storage_location`;
CREATE TABLE `wms_base_storage_location` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `storage_location_no` varchar(32) DEFAULT NULL COMMENT '库位编号',
  `storage_location_name` varchar(64) DEFAULT NULL COMMENT '库位名称',
  `area_no` varchar(32) DEFAULT NULL COMMENT '区域编号',
  `warehouse_no` varchar(32) DEFAULT NULL COMMENT '仓库编号',
  `length` decimal(10,2) DEFAULT NULL COMMENT '长',
  `width` decimal(10,2) DEFAULT NULL COMMENT '宽',
  `height` decimal(10,2) DEFAULT NULL COMMENT '高',
  `storage_location_type` char(1) DEFAULT NULL COMMENT '库位类型',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `create_user` varchar(64) DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='库位';

-- ----------------------------
-- Records of wms_base_storage_location
-- ----------------------------

-- ----------------------------
-- Table structure for wms_base_warehouse
-- ----------------------------
DROP TABLE IF EXISTS `wms_base_warehouse`;
CREATE TABLE `wms_base_warehouse` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `warehouse_no` varchar(32) DEFAULT NULL COMMENT '仓库编号',
  `warehouse_name` varchar(64) DEFAULT NULL COMMENT '仓库名称',
  `warehouse_acreage` varchar(32) DEFAULT NULL COMMENT '仓库面积',
  `warehouse_type` varchar(32) DEFAULT NULL COMMENT '仓库类型',
  `warehouse_address` varchar(64) DEFAULT NULL COMMENT '仓库地址',
  `create_user` varchar(32) DEFAULT NULL COMMENT '创建人',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='仓库信息表';

-- ----------------------------
-- Records of wms_base_warehouse
-- ----------------------------
INSERT INTO `wms_base_warehouse` VALUES ('1', '1', '测试仓库1', '100000', '1', '新加坡科技园', 'admin', '2018-03-28 10:50:46', null);

-- ----------------------------
-- Table structure for wms_in_stock
-- ----------------------------
DROP TABLE IF EXISTS `wms_in_stock`;
CREATE TABLE `wms_in_stock` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `in_stock_no` varchar(64) DEFAULT NULL COMMENT '入库单号',
  `warehouse_no` varchar(64) DEFAULT NULL COMMENT '仓库编号',
  `in_stock_status` char(2) DEFAULT NULL COMMENT '状态(10:新建,11:已到货,12:已理货,13:已上架,14:入库完成,18:已关闭)',
  `memo` varchar(64) DEFAULT NULL COMMENT '备注',
  `dh_date` datetime DEFAULT NULL COMMENT '到货时间',
  `tally_date` datetime DEFAULT NULL COMMENT '理货完成时间',
  `sj_date` datetime DEFAULT NULL COMMENT '上架完成时间',
  `fin_date` datetime DEFAULT NULL COMMENT '入库完成时间',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=186 DEFAULT CHARSET=utf8 COMMENT='入库单';

-- ----------------------------
-- Records of wms_in_stock
-- ----------------------------
INSERT INTO `wms_in_stock` VALUES ('185', '41234123414', '1', '10', '备注', '2018-04-03 13:22:47', '2018-04-02 13:22:51', '2018-04-02 14:22:54', '2018-04-02 15:23:00', '2018-04-02 13:23:06', null);

-- ----------------------------
-- Table structure for wms_in_stock_dtl
-- ----------------------------
DROP TABLE IF EXISTS `wms_in_stock_dtl`;
CREATE TABLE `wms_in_stock_dtl` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `in_stock_no` varchar(64) DEFAULT NULL COMMENT '入库单号',
  `goods_no` varchar(64) DEFAULT NULL COMMENT '商品编号',
  `pn` varchar(64) DEFAULT NULL COMMENT '商品pn',
  `g_name` varchar(64) DEFAULT NULL COMMENT '商品名称',
  `g_model` varchar(64) DEFAULT NULL COMMENT '规格',
  `g_unit` varchar(3) DEFAULT NULL COMMENT '计量单位',
  `g_qty` int(11) DEFAULT NULL COMMENT '数量',
  `g_price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `storage_location_no` varchar(64) DEFAULT NULL COMMENT '库位编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=321 DEFAULT CHARSET=utf8 COMMENT='入库明细';

-- ----------------------------
-- Records of wms_in_stock_dtl
-- ----------------------------
INSERT INTO `wms_in_stock_dtl` VALUES ('315', '41234123414', '20180328021015070261', '918983133', 'SOTHEA 2017秋冬新款 高质感特定纱线欧美宽松马海毛羊毛毛衣', 'xl', '件', '100', '400.00', '');
INSERT INTO `wms_in_stock_dtl` VALUES ('316', '41234123414', '20180328021015070261', '918983133', 'SOTHEA 2017秋冬新款 高质感特定纱线欧美宽松马海毛羊毛毛衣', 'xl', '件', '100', '400.00', null);
INSERT INTO `wms_in_stock_dtl` VALUES ('317', '41234123414', '20180328021015070261', '918983133', 'SOTHEA 2017秋冬新款 高质感特定纱线欧美宽松马海毛羊毛毛衣', 'xl', '件', '100', '400.00', null);
INSERT INTO `wms_in_stock_dtl` VALUES ('318', '41234123414', '20180328021015070261', '918983133', 'SOTHEA 2017秋冬新款 高质感特定纱线欧美宽松马海毛羊毛毛衣', 'xl', '件', '100', '400.00', null);
INSERT INTO `wms_in_stock_dtl` VALUES ('319', '41234123414', '20180328021015070261', '918983133', 'SOTHEA 2017秋冬新款 高质感特定纱线欧美宽松马海毛羊毛毛衣', 'xl', '件', '100', '400.00', null);
INSERT INTO `wms_in_stock_dtl` VALUES ('320', '41234123414', '20180328021015070261', '918983133', 'SOTHEA 2017秋冬新款 高质感特定纱线欧美宽松马海毛羊毛毛衣', 'xl', '件', '100', '400.00', null);

-- ----------------------------
-- Table structure for wms_order
-- ----------------------------
DROP TABLE IF EXISTS `wms_order`;
CREATE TABLE `wms_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(64) DEFAULT NULL COMMENT '订单编号',
  `fee_amount` decimal(10,2) DEFAULT NULL COMMENT '运费 可填写 0',
  `total_count` int(11) DEFAULT NULL COMMENT '总件数',
  `logis_name` varchar(64) DEFAULT NULL COMMENT '物流企业名称',
  `order_status` varchar(2) DEFAULT NULL COMMENT '订单状态(21:订单初始化,22:拣货完成，23:已发货，24:已收货，28:订单关闭)',
  `memo` varchar(255) DEFAULT NULL COMMENT '备注',
  `waybill_no` varchar(32) DEFAULT NULL COMMENT '运单号',
  `consignee_tel` varchar(64) DEFAULT NULL COMMENT '收件人联系方式',
  `consignee` varchar(64) DEFAULT NULL COMMENT '收件人姓名',
  `consignee_zip` varchar(6) DEFAULT NULL COMMENT '邮编',
  `consignee_province` varchar(32) DEFAULT NULL COMMENT '收件人省份',
  `consignee_city` varchar(32) DEFAULT NULL COMMENT '收件人城市',
  `consignee_area` varchar(32) DEFAULT NULL COMMENT '收件人区',
  `consignee_addres` varchar(255) DEFAULT NULL COMMENT '收件人地址',
  `warehouse_no` varchar(32) DEFAULT NULL COMMENT '仓库编码',
  `trade_time` datetime DEFAULT NULL COMMENT '成交时间',
  `ship_time` datetime DEFAULT NULL COMMENT '发货时间',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1437 DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Records of wms_order
-- ----------------------------
INSERT INTO `wms_order` VALUES ('1436', '34555445', '10.00', '2', '顺丰', '21', null, '6556234434', '17888888888', '李成义', '300000', '浙江', '杭州', '江干', '新加坡科技园', '1', '2018-04-03 10:56:32', '2018-04-03 10:56:35', '2018-04-03 10:56:37', null);

-- ----------------------------
-- Table structure for wms_order_dtl
-- ----------------------------
DROP TABLE IF EXISTS `wms_order_dtl`;
CREATE TABLE `wms_order_dtl` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_no` varchar(64) DEFAULT NULL COMMENT '订单编号',
  `g_name` varchar(255) DEFAULT NULL COMMENT '物品名称',
  `g_model` varchar(255) DEFAULT NULL COMMENT '商品规格',
  `g_color` varchar(64) DEFAULT NULL COMMENT '颜色',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `g_no` varchar(64) DEFAULT NULL COMMENT '商品编号',
  `pn` varchar(64) DEFAULT NULL COMMENT '商品编码',
  `qty` int(11) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50239 DEFAULT CHARSET=utf8 COMMENT='订单表明细';

-- ----------------------------
-- Records of wms_order_dtl
-- ----------------------------

-- ----------------------------
-- Table structure for wms_out_stock
-- ----------------------------
DROP TABLE IF EXISTS `wms_out_stock`;
CREATE TABLE `wms_out_stock` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `out_stock_no` varchar(64) DEFAULT NULL COMMENT '出库单号',
  `warehouse_no` varchar(64) DEFAULT NULL COMMENT '仓库编号',
  `out_stock_status` char(2) DEFAULT NULL COMMENT '状态(31：新建，32：已拣货，38：已关闭)',
  `memo` varchar(64) DEFAULT NULL COMMENT '备注',
  `out_date` datetime DEFAULT NULL COMMENT '拣货完成时间',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=186 DEFAULT CHARSET=utf8 COMMENT='出库单';

-- ----------------------------
-- Records of wms_out_stock
-- ----------------------------
INSERT INTO `wms_out_stock` VALUES ('185', '23452347456123', '1', '31', '备注', '2018-04-03 16:15:15', '2018-04-02 16:15:18', null);

-- ----------------------------
-- Table structure for wms_out_stock_dtl
-- ----------------------------
DROP TABLE IF EXISTS `wms_out_stock_dtl`;
CREATE TABLE `wms_out_stock_dtl` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `out_stock_no` varchar(64) DEFAULT NULL COMMENT '出库单号',
  `goods_no` varchar(64) DEFAULT NULL COMMENT '商品编号',
  `pn` varchar(64) DEFAULT NULL COMMENT '商品pn',
  `g_name` varchar(64) DEFAULT NULL COMMENT '商品名称',
  `g_model` varchar(64) DEFAULT NULL COMMENT '规格',
  `g_unit` varchar(3) DEFAULT NULL COMMENT '计量单位',
  `g_qty` int(11) DEFAULT NULL COMMENT '数量',
  `storage_location_no` varchar(64) DEFAULT NULL COMMENT '库位编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=315 DEFAULT CHARSET=utf8 COMMENT='出库明细';

-- ----------------------------
-- Records of wms_out_stock_dtl
-- ----------------------------

-- ----------------------------
-- Table structure for wms_stock
-- ----------------------------
DROP TABLE IF EXISTS `wms_stock`;
CREATE TABLE `wms_stock` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `goods_no` varchar(64) DEFAULT NULL COMMENT '商品编号',
  `warehouse_no` varchar(64) DEFAULT NULL COMMENT '仓库编码',
  `g_qty` int(11) DEFAULT NULL COMMENT '仓库总数量',
  `gmt_create` datetime DEFAULT NULL COMMENT '记录创建时间',
  `gmt_modified` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '库存更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5147 DEFAULT CHARSET=utf8 COMMENT='库存表头';

-- ----------------------------
-- Records of wms_stock
-- ----------------------------
INSERT INTO `wms_stock` VALUES ('5145', '20180328021015070261', '1', '2000', '2018-04-10 10:05:13', null);
INSERT INTO `wms_stock` VALUES ('5146', '20180328080015072567', '1', '3000', '2018-04-10 10:05:27', null);

-- ----------------------------
-- Table structure for wms_stock_dtl
-- ----------------------------
DROP TABLE IF EXISTS `wms_stock_dtl`;
CREATE TABLE `wms_stock_dtl` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `goods_no` varchar(64) DEFAULT NULL COMMENT '商品编号',
  `storage_location_no` varchar(64) DEFAULT NULL COMMENT '库位编号',
  `area_no` varchar(64) DEFAULT NULL COMMENT '库区编号',
  `g_qty` int(11) DEFAULT NULL COMMENT '数量',
  `gmt_create` datetime DEFAULT NULL COMMENT '记录创建时间',
  `gmt_modified` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '库存更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5250 DEFAULT CHARSET=utf8 COMMENT='库存表明细';

-- ----------------------------
-- Records of wms_stock_dtl
-- ----------------------------
INSERT INTO `wms_stock_dtl` VALUES ('5246', '20180328021015070261', 'A-01-01-01-01', 'A', '600', '2018-04-10 10:05:56', null);
INSERT INTO `wms_stock_dtl` VALUES ('5247', '20180328021015070261', 'A-01-01-01-02', 'A', '1400', '2018-04-10 10:06:17', '2018-04-10 10:06:17');
INSERT INTO `wms_stock_dtl` VALUES ('5248', '20180328080015072567', 'A_01-01-01-03', 'A', '500', '2018-04-10 10:06:42', null);
INSERT INTO `wms_stock_dtl` VALUES ('5249', '20180328080015072567', 'A-02-02-02-02', 'A', '2500', '2018-04-10 10:07:07', null);
