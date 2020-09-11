package com.dciwang.message;

public class MessageIdConstants {


  private MessageIdConstants() {
  }

  // ----------------------------------------------------
  // 业务异常用Message ID
  // ----------------------------------------------------

  /**
   * 数据源名称重复，请重新输入。
   */
  public static final String MESSAGE_E0001 = "E0001";

  /**
   * Schedule未定义。
   */
  public static final String MESSAGE_E0002 = "E0002";

  /**
   * Schedule已经启动。
   */
  public static final String MESSAGE_E0003 = "E0003";

  /**
   * 启动脚本不存在。
   */
  public static final String MESSAGE_E0004 = "E0004";

  /**
   * Schedule未启动。
   */
  public static final String MESSAGE_E0005 = "E0005";

  /**
   * 调度 [{0}] 停止异常。
   */
  public static final String MESSAGE_E0006 = "E0006";

  /**
   * 调度 [{0}] 停止失败。
   */
  public static final String MESSAGE_E0007 = "E0007";

  /**
   * 数据库连接发生异常，请确认数据源配置是否正确。
   */
  public static final String MESSAGE_E0008 = "E0008";

  /**
   * 文件编码输入有误，请确认。
   */
  public static final String MESSAGE_E0009 = "E0009";

  /**
   * 文件读取发生异常，请确认。
   */
  public static final String MESSAGE_E0010 = "E0010";

  /**
   * 重命名文件失败。
   */
  public static final String MESSAGE_E0011 = "E0011";

  /**
   * 输入的文件路径找不到。
   */
  public static final String MESSAGE_E0012 = "E0012";

  /**
   * Csv文件没有找到。
   */
  public static final String MESSAGE_E0013 = "E0013";

  /**
   * Csv文件内容为空，请确认。
   */
  public static final String MESSAGE_E0014 = "E0014";

  /**
   * 数据源表暂不支持除Oracle外的Sql语句！
   */
  public static final String MESSAGE_E0015 = "E0015";

  /**
   * 请以CREATE TABLE 为开始填写SQL语句！
   */
  public static final String MESSAGE_E0016 = "E0016";

  /**
   * 该表 {0} 没有找到对应的外部表，操作失败。
   */
  public static final String MESSAGE_E0017 = "E0017";

  // ----------------------------------------------------
  // 共通异常用Message ID
  // ----------------------------------------------------
  /**
   * 用户名或者密码错误。
   */
  public static final String MESSAGE_E0060 = "E0060";

  /**
   * 该用户被锁定，请重新设置密码。
   */
  public static final String MESSAGE_E0061 = "E0061";

  /**
   * 请修改初始密码。
   */
  public static final String MESSAGE_E0062 = "E0062";

  /**
   * 登录发生异常。
   */
  public static final String MESSAGE_E0063 = "E0063";

  /**
   * 插入发生异常 : 注册用户已经存在。
   */
  public static final String MESSAGE_E0064 = "E0064";

  /**
   * 插入发生异常 : 注册邮箱已经存在。
   */
  public static final String MESSAGE_E0065 = "E0065";

  /**
   * 文件下载失败。
   */
  public static final String MESSAGE_E0066 = "E0066";

  /**
   * 下载文件不存在。
   */
  public static final String MESSAGE_E0067 = "E0067";

  /**
   * 请输入有效的邮箱。
   */
  public static final String MESSAGE_E0068 = "E0068";

  /**
   * 输入邮箱格式不正确。
   */
  public static final String MESSAGE_E0069 = "E0069";

  /**
   * 该用户已经存在。
   */
  public static final String MESSAGE_E0070 = "E0070";

  /**
   * URL无效，请重新进行密码重置操作。
   */
  public static final String MESSAGE_E0071 = "E0071";

  /**
   * 输入密码跟上次相同，请重新输入。
   */
  public static final String MESSAGE_E0072 = "E0072";

  /**
   * 角色名称已存在
   */
  public static final String MESSAGE_E0073 = "E0073";

  /**
   * 删除失败。
   */
  public static final String MESSAGE_E0074 = "E0074";

  /**
   * 该数据不存在，请刷新页面后重新进行{0}操作。
   */
  public static final String MESSAGE_E0075 = "E0075";

  /**
   * 输入参数不正确。
   */
  public static final String MESSAGE_E0076 = "E0076";

  // ----------------------------------------------------
  // 系统异常用Message ID
  // ----------------------------------------------------
  /**
   * 没有该业务的访问权限。
   */
  public static final String MESSAGE_E0080 = "E0080";

  /**
   * 邮件发送失败。
   */
  public static final String MESSAGE_E0081 = "E0081";

    /**
     * 执行JOB失败。
     */
    public static final String MESSAGE_E0082 = "E0082";

  /**
   * 发生了系统异常，如有需要请跟系统管理员联系。
   */
  public static final String MESSAGE_E0099 = "E0099";

  // ----------------------------------------------------
  // Information Message
  // ----------------------------------------------------

  /**
   * 保存成功。
   */
  public static final String MESSAGE_I0001 = "I0001";

  /**
   * 修改成功。
   */
  public static final String MESSAGE_I0002 = "I0002";

  /**
   * 删除成功。
   */
  public static final String MESSAGE_I0003 = "I0003";

  /**
   * 操作成功。
   */
  public static final String MESSAGE_I0004 = "I0004";

  /**
   * 数据库连接成功。
   */
  public static final String MESSAGE_I0005 = "I0005";

  // ----------------------------------------------------
  // 画面单项目check用Message ID
  // ----------------------------------------------------
  /**
   * {0}请输入英文或者数字。
   */
  public static final String MESSAGE_ES001 = "ES001";

  /**
   * {0}请输入正确的日期格式({1})。
   */
  public static final String MESSAGE_ES002 = "ES002";

  /**
   * {0}请输入正确的邮箱格式。
   */
  public static final String MESSAGE_ES003 = "ES003";

  /**
   * {0}长度最长请输入{1}个文字。
   */
  public static final String MESSAGE_ES004 = "ES004";

  /**
   * {0}长度请输入{1}-{2}以内。
   */
  public static final String MESSAGE_ES005 = "ES005";

  /**
   * {0}必须输入。
   */
  public static final String MESSAGE_ES006 = "ES006";

  /**
   * {0}必须输入数字。
   */
  public static final String MESSAGE_ES007 = "ES007";

  /**
   * {0}请输入正确的电话号码。
   */
  public static final String MESSAGE_ES008 = "ES008";

  /**
   * {0}长度在8-30位、请输入英文、数字、特殊字符中的两种。
   */
  public static final String MESSAGE_ES009 = "ES009";

  /**
   * {0}必须选择。
   */
  public static final String MESSAGE_ES010 = "ES010";

}
