package com.rrl.base.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_corpus_info")
public class CorpusInfo {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 语料
     */
    @Column(name = "QUESTION")
    private String question;

    /**
     * 答案
     */
    @Column(name = "ANSWER")
    private String answer;

    /**
     * 0: 入口, 1:对话
     */
    @Column(name = "ISTALK")
    private Boolean istalk;

    /**
     * 环节
     */
    @Column(name = "STEP")
    private Integer step;

    /**
     * 父id
     */
    @Column(name = "PID")
    private Long pid;

    /**
     * 渠道
     */
    @Column(name = "CHANNEL")
    private Integer channel;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取语料
     *
     * @return QUESTION - 语料
     */
    public String getQuestion() {
        return question;
    }

    /**
     * 设置语料
     *
     * @param question 语料
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * 获取答案
     *
     * @return ANSWER - 答案
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 设置答案
     *
     * @param answer 答案
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * 获取0: 入口, 1:对话
     *
     * @return ISTALK - 0: 入口, 1:对话
     */
    public Boolean getIstalk() {
        return istalk;
    }

    /**
     * 设置0: 入口, 1:对话
     *
     * @param istalk 0: 入口, 1:对话
     */
    public void setIstalk(Boolean istalk) {
        this.istalk = istalk;
    }

    /**
     * 获取环节
     *
     * @return STEP - 环节
     */
    public Integer getStep() {
        return step;
    }

    /**
     * 设置环节
     *
     * @param step 环节
     */
    public void setStep(Integer step) {
        this.step = step;
    }

    /**
     * 获取父id
     *
     * @return PID - 父id
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置父id
     *
     * @param pid 父id
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 获取渠道
     *
     * @return CHANNEL - 渠道
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * 设置渠道
     *
     * @param channel 渠道
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}