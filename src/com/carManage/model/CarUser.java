package com.carManage.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author 47 车主信息管理表
 */
@Entity
public class CarUser {
	@Id
	private String id;// 车主身份证信息,不能为空,也是主键
	@Column(nullable = false, length = 10)
	private String name;// 车主姓名
	@Column(nullable = true)
	private Date birthday;// 车主生日
	@Column(nullable = false)
	private String sex;// 车主性别
	@Column(nullable = false)
	private Date create_time;// 录入时间
	@Column(nullable = true)
	private String address;// 车主地址
	@Column(nullable = true)
	private String picture_urls;// 图片url地址,多张图片以逗号隔开
	@Column(nullable = false)
	private String phone;// 车主手机号码
	@Column(nullable = false)
	private String common; //备注

	public CarUser() {

	}

	public CarUser(String id, String name, Date birthday, String sex,
			Date create_time, String address, String picture_urls, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.create_time = create_time;
		this.address = address;
		this.picture_urls = picture_urls;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPicture_urls() {
		return picture_urls;
	}

	public void setPicture_urls(String picture_urls) {
		this.picture_urls = picture_urls;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	@Override
	public String toString() {
		return "CarUser [id=" + id + ", name=" + name + ", birthday="
				+ birthday + ", sex=" + sex + ", create_time=" + create_time
				+ ", address=" + address + ", picture_urls=" + picture_urls
				+ ", phone=" + phone + ", common=" + common + "]";
	}

	// 更新数据
	public void updateCarUser(CarUser cu) {
		this.name = cu.name == null ? this.name : cu.name;
		this.birthday = cu.birthday == null ? this.birthday : cu.birthday;
		this.sex = cu.sex == null ? this.sex : cu.sex;
		this.address = cu.address == null ? this.address : cu.address;
		this.picture_urls = cu.picture_urls == null ? this.picture_urls : cu.picture_urls;
		this.phone = cu.phone == null ? this.phone : cu.phone;
		this.common = cu.common == null ? this.common : cu.common;
	}

}
