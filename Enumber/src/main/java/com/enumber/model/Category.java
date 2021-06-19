package com.enumber.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id")
	private Long id;
	@Column(name = "name")
	private String name;
	@ManyToOne
	@JoinColumn(name = "category_id")
	@Column(name = "perent_category_id")
	private Long perentId; 

    @OneToMany(mappedBy = "perent_category_id", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Category> children = new ArrayList<Category>();

}
