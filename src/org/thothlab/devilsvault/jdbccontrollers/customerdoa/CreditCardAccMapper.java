package org.thothlab.devilsvault.jdbccontrollers.customerdoa;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.thothlab.devilsvault.CustomerModel.CreditAccount;
/*import org.thothlab.devilsvault.jdbccontrollers.model.Request;*/
//import org.thothlab.devilsvault.CustomerModel.CreditCardDetailsModel;

public class CreditCardAccMapper implements RowMapper<CreditAccount>  {

	@Override
	public CreditAccount mapRow(ResultSet rs, int arg1) throws SQLException {
		CreditAccount obj = new CreditAccount();
		obj.setId(rs.getInt("id"));
		obj.setCredit_card_no(rs.getInt("credit_card_no"));
		obj.setAvailBalance(rs.getInt("available_balance"));
		obj.setLastBillAmount(rs.getInt("last_bill_amount"));
		obj.setDueDateTimestamp(rs.getInt("due_date"));
		obj.setApr(rs.getFloat("apr"));
		obj.setBank_accounts_id(rs.getInt("bank_accounts_id"));
		//obj.setOwner(rs.get);
		return obj;
	}

}