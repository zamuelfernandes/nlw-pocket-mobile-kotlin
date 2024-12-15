package com.zamuelfernandes.nearby.ui.components.market_details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zamuelfernandes.nearby.data.model.Rule
import com.zamuelfernandes.nearby.data.model.mock.mockRules
import com.zamuelfernandes.nearby.ui.theme.Gray400
import com.zamuelfernandes.nearby.ui.theme.Gray500
import com.zamuelfernandes.nearby.ui.theme.Typography

@Composable
fun NearbyMarketDetailsRules(
    modifier: Modifier = Modifier,
    rules: List<Rule>,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ){
        Text(text = "Regulamento", style = Typography.headlineSmall, color = Gray400)

        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = rules.joinToString(separator = "\n", transform = {"• ${it.description}"}),
            color = Gray500,
            style = Typography.labelMedium,
            lineHeight = 24.sp
        )
    }
}


@Preview
@Composable
private fun NearbyMarketDetailsRulesPreview() {
    NearbyMarketDetailsRules(
        modifier = Modifier.fillMaxWidth(),
        rules = mockRules,
    )
}