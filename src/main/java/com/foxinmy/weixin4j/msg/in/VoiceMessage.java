package com.foxinmy.weixin4j.msg.in;

import com.foxinmy.weixin4j.msg.BaseMessage;
import com.foxinmy.weixin4j.type.MessageType;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 语音消息
 * <p>开通语音识别功能,用户每次发送语音给公众号时,微信会在推送的语音消息XML数据包中,赋值到Recongnition字段.</p>
 * @className VoiceMessage
 * @author jy.hu
 * @date 2014年4月6日
 * @since JDK 1.7
 * @see <a href="http://mp.weixin.qq.com/wiki/index.php?title=%E6%8E%A5%E6%94%B6%E6%99%AE%E9%80%9A%E6%B6%88%E6%81%AF#.E8.AF.AD.E9.9F.B3.E6.B6.88.E6.81.AF">语音消息</a>
 * @see com.foxinmy.weixin4j.msg.BaseMessage
 * @see com.foxinmy.weixin4j.msg.BaseMessage#toXml()
 */
public class VoiceMessage extends BaseMessage {

	private static final long serialVersionUID = -7988380977182214003L;

	public VoiceMessage() {
		super(MessageType.voice);
	}

	@XStreamAlias("MediaId")
	private String mediaId; // 语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
	@XStreamAlias("Format")
	private String format; // 语音格式，如amr，speex等
	
	@XStreamAlias("Recognition")
	private String recognition; // 语音识别结果，UTF8编码

	public String getRecognition() {
		return recognition;
	}

	public void setRecognition(String recognition) {
		this.recognition = recognition;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[VoiceMessage ,toUserName=").append(super.getToUserName());
		sb.append(" ,fromUserName=").append(super.getFromUserName());
		sb.append(" ,msgType=").append(super.getMsgType().name());
		sb.append(" ,mediaId=").append(mediaId);
		sb.append(" ,format=").append(format);
		sb.append(" ,recognition=").append(recognition);
		sb.append(" ,createTime=").append(super.getCreateTime());
		sb.append(" ,msgId=").append(super.getMsgId()).append("]");
		return sb.toString();
	}
}